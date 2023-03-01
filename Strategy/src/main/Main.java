package main;


public class Main {

	public static void main(String[] args) {
		ConverterKonteksti ck = new ConverterKonteksti(new Converter1());
		
		ck.tulosta();
		
		ck.setConverter(new Converter2());
		
		ck.tulosta();
		
		ck.setConverter(new Converter3());
		
		ck.tulosta();
	}

}
