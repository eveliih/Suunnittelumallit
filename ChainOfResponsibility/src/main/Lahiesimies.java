package main;

public class Lahiesimies extends Kasittelija {
	// max 2 % korotus

	private final double MAX_PROSENTIT = 2;

	public void kasittelePyynto(PalkankorotusPyynto pyynto) {
		double korotus = ((pyynto.getPalkkaPyynto() - pyynto.getPalkka()) / pyynto.getPalkka()) * 100;

		if (korotus <= MAX_PROSENTIT) {
			System.out.println("Lähiesimies hyväksynyt palkankorotuspyynnön (" + pyynto.getPalkkaPyynto()
					+ "€). Pyyntö on " + korotus + " % enemmän kuin vanha palkka.");
		} else {
			super.kasittelePyynto(pyynto);
		}
	}

}
