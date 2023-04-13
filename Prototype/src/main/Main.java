package main;

public class Main {

	public static void main(String[] args) {
		Kello kello = new Kello(13, 5, 3);
		
		Kello kopio = kello.clone();
		
		System.out.println(kello);
		System.out.println(kopio);
		
		kello.asetaAika(14, 0, 0);

		System.out.println(kello);
		System.out.println(kopio);
	}

}
