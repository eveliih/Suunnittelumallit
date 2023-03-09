package main;

public class Paallikko extends Kasittelija {
//2 - 5 %
	private final double MAX_PROSENTIT = 5.0;

	public void kasittelePyynto(PalkankorotusPyynto pyynto) {
		double korotus = ((pyynto.getPalkkaPyynto() - pyynto.getPalkka()) / pyynto.getPalkka()) * 100;
		if (korotus < MAX_PROSENTIT) {
			System.out.println("Päällikkö hyväksynyt palkankorotuspyynnön (" + pyynto.getPalkkaPyynto()
					+ "€). Pyyntö on " + korotus + " % enemmän kuin vanha palkka.");
		} else {
			super.kasittelePyynto(pyynto);
		}
	}
}
