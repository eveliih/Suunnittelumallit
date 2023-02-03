package main;

public class Verkkokortti implements Laiteosa {
	private double hinta;

	public Verkkokortti(double hinta) {
		super();
		this.hinta = hinta;
	}

	@Override
	public double kerroHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä laiteosaa laiteosaan");

	}

}
