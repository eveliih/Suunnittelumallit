package main;

public class Prosessori implements Laiteosa {
	private double hinta;

	public Prosessori(double hinta) {
		super();
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
