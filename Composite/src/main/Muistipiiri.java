package main;

public class Muistipiiri implements Laiteosa {
	private double hinta;

	public Muistipiiri(double hinta) {
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
