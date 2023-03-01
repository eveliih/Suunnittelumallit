package main;

import java.util.List;

public class Converter3 implements ListConverter {

	@Override
	public String listToString(List<Integer> lista) {
		Integer[] taulukko = new Integer[lista.size()];
		lista.toArray(taulukko);
		
		String palautettava = "";
		
		for (int i = 0; i < taulukko.length; i++) {
			if ((i + 1) % 3 == 0) {
				palautettava += taulukko[i] + "\n";
			} else {
				palautettava += taulukko[i];
			}
		}
		palautettava += "\n";
		
		return palautettava;
	}

}
