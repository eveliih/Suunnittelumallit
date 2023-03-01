package main;

import java.util.Iterator;
import java.util.List;

public class Converter1 implements ListConverter {

	@Override
	public String listToString(List<Integer> lista) {
		Iterator<Integer> it = lista.iterator();
		String palautettava = "";
		
		while(it.hasNext()) {
			palautettava = palautettava + it.next() + "\n";
		}
		return palautettava;
	}

}
