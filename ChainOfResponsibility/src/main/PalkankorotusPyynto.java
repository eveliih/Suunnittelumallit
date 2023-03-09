package main;

public class PalkankorotusPyynto {
	private double nykyinenPalkka;
	private double uusiPalkkaPyynto;

	public PalkankorotusPyynto(double nykyinenPalkka, double pyynto) {
	this.nykyinenPalkka = nykyinenPalkka;
	this.uusiPalkkaPyynto = pyynto;
	}

	public double getPalkka() {
		return nykyinenPalkka;
	}

	public void setPalkka(double palkka) {
		nykyinenPalkka = palkka;
	}

	public double getPalkkaPyynto() {
		return uusiPalkkaPyynto;
	}

	public void setPalkkaPyynto(double pyynto) {
		uusiPalkkaPyynto = pyynto;
	}

}
