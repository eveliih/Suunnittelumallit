package main;

public class Main {

	public static void main(String[] args) {
		Lahiesimies lahies = new Lahiesimies();
		Paallikko plk = new Paallikko();
		Toimitusjohtaja tj = new Toimitusjohtaja();

		lahies.setSeuraavaKasittelija(plk);
		plk.setSeuraavaKasittelija(tj);

		//Lähiesimies hyväksyy 1,6%
		lahies.kasittelePyynto(new PalkankorotusPyynto(2500, 2540));
		
		//Päällikkö hyväksyy 4,8%
		lahies.kasittelePyynto(new PalkankorotusPyynto(2500, 2620));
		
		//Toimitusjohtaja hyväksyy 8,8%
		lahies.kasittelePyynto(new PalkankorotusPyynto(2500, 2720));
		
		//Ei hyväksytä 28.8%
		lahies.kasittelePyynto(new PalkankorotusPyynto(2500, 3220));
		
	}

}
