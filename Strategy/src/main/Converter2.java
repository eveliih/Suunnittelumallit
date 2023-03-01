package main;

import java.util.List;

public class Converter2 implements ListConverter {

	@Override
	public String listToString(List<Integer> lista) {
		String palautettava = "";
		for (int i = 0; i < lista.size(); i++) {
			if ((i + 1) % 2 == 0) {
				palautettava += +lista.get(i) + "\n";
			} else {
				palautettava += lista.get(i);
			}
		}
		palautettava += "\n";

		return palautettava;
	}

}
