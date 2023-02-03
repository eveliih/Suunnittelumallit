package main;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

	List <Laiteosa> osat = new ArrayList<Laiteosa>();


	@Override
	public double kerroHinta() {
		double summa = 0;
		for(Laiteosa l: osat) {
			summa+= l.kerroHinta();
		}
		return summa;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa laiteosa) {
		osat.add(laiteosa);
	}


}
