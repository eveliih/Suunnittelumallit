package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TokaTesti {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 11; i++) {
			lista.add(i);
		}

		Iterator<Integer> iterator = lista.iterator();

		Saie saie1 = new Saie(iterator);
		Saie saie2 = new Saie(iterator);

		saie1.start();
		saie2.start();

	}

}
