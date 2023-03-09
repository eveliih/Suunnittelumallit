package main;

public class Pelaaja extends Thread {

	private Object omaLukuPelissa;
	private String nimi;
	private Arvuuttaja arvuuttaja;
	private boolean arvataan = true;

	public Pelaaja(String nimi, Arvuuttaja arvuuttaja) {
		this.nimi = nimi;
		this.arvuuttaja = arvuuttaja;
	}

	public void liity(Arvuuttaja arvuutattaja) {
		this.omaLukuPelissa = arvuutattaja.liityPeliin(nimi);
	}

	private boolean arvaa(Arvuuttaja arvuuttaja, int arvaus) {
		int vastaus = arvuuttaja.tarkastaLuku(omaLukuPelissa, arvaus);
		if (vastaus == 0) {
			System.out.println(this.nimi + " arvasi väärin!");
			return true;
		}

		System.out.println(this.nimi + " arvasi oikein! Luku oli " + vastaus + ".");
		return false;

	}

	public void run() {
		while (arvataan) {
			try {
				Thread.sleep(200);
				arvataan = arvaa(arvuuttaja, 1 + (int) (Math.random() * ((10 - 1) + 1)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
