package main;

public class Toimitusjohtaja extends Kasittelija {
//yli 5 %
	private final double MAX_PROSENTIT = 20;

	public void kasittelePyynto(PalkankorotusPyynto pyynto) {
		double korotus = ((pyynto.getPalkkaPyynto() - pyynto.getPalkka()) / pyynto.getPalkka()) * 100;
		if (korotus < MAX_PROSENTIT) {
			System.out.println("Toimitusjohtaja hyväksynyt palkankorotuspyynnön (" + pyynto.getPalkkaPyynto()
					+ "€). Pyyntö on " + korotus + " % enemmän kuin vanha palkka.");
		} else {
			System.out.println("Palkankorotuspyyntöäsi ei hyväksytty. Pyyntö liian suuri (korotus " + korotus + " %).");
		}
	}
}
