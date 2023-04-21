package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NelosTesti {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 11; i++) {
			lista.add(i);
		}

		Iterator<Integer> iterator = lista.iterator();
		
		iterator.forEachRemaining((numero) -> System.out.println(numero + 5));

	}

}
