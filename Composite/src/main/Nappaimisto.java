package main;

public class Nappaimisto implements Laiteosa {
	private double hinta;

	public Nappaimisto(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double kerroHinta() {
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä laiteosaa laiteosaan");

	}

}
