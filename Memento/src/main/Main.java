package main;

public class Main {

	public static void main(String[] args) {

		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Pelaaja maija = new Pelaaja("Maija", arvuuttaja);
		Pelaaja pekka = new Pelaaja("Pekka", arvuuttaja);
		Pelaaja ukko = new Pelaaja("Ukko", arvuuttaja);

		maija.liity(arvuuttaja);
		pekka.liity(arvuuttaja);
		ukko.liity(arvuuttaja);

		maija.start();
		pekka.start();
		ukko.start();

	}

}
