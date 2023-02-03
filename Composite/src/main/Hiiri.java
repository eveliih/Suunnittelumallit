package main;

public class Hiiri implements Laiteosa {

	private double hinta;

	public Hiiri(double hinta) {
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
