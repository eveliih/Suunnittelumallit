package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Class<?> c = null;
		VaateFactory factory = null;

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("factory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("tehdas"));
			factory = (VaateFactory) c.getDeclaredConstructor().newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
		Farmarit farmarit = factory.createFarmarit();
		TPaita tpaita = factory.createTPaita();
		Lippis lippis = factory.createLippis();
		Kengat kengat = factory.createKengat();

		System.out.println("Olen Jasper ja päälläni on:\n-farmarit, joissa on " + farmarit + "\n-T-paita joka on "
				+ tpaita + "\n-lippis joka on " + lippis + " \n-kengät jotka ovat " + kengat);

	}

}
