package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConverterKonteksti {
	private ListConverter converter;
	private List<Integer> lista = new ArrayList<>();
	
	public ConverterKonteksti(ListConverter converter) {
		this.converter = converter;
		Collections.addAll(lista, 1, 2, 3, 4, 5, 6, 7);
	}
	
	public void setConverter(ListConverter lc) {
		this.converter = lc;
	}
	
	public void tulosta() {
		System.out.println(converter.listToString(lista));
	}
}
