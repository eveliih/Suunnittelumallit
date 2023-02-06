package main;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		SingletonPesukone pesukone = SingletonPesukone.getInstance();

		pesukone.varaaPyykkivuoro("6.2.23", "18:00");
		pesukone.varaaPyykkivuoro("6.2.23", "11:00");
		pesukone.varaaPyykkivuoro("7.2.23", "16:00");
		pesukone.varaaPyykkivuoro("19.2.23", "19:00");
		pesukone.varaaPyykkivuoro("5.3.23", "15:00");

		System.out.println("Varauskirja: ");
		for (Map.Entry<String, String> set : pesukone.getVarauskirja().entrySet()) {

			System.out.println(set.getKey() + " Klo: " + set.getValue());
		}
	}

}
