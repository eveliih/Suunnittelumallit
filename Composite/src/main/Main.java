package main;

public class Main {

	public static void main(String[] args) {
		Poytakone kone = new Poytakone();
		Kotelo kotelo = new Kotelo();
		Emolevy emo = new Emolevy();
		Virtalahde virtalahde = new Virtalahde(105);
		Muistipiiri muisti = new Muistipiiri(90);
		Prosessori prosessori = new Prosessori(200);
		Verkkokortti verkko = new Verkkokortti(100);
		Hiiri hiiri = new Hiiri(19.90);
		Nappaimisto nappaimisto = new Nappaimisto(35);

		emo.lisaaLaiteosa(verkko);
		emo.lisaaLaiteosa(muisti);
		emo.lisaaLaiteosa(prosessori);

		kotelo.lisaaLaiteosa(emo);
		kotelo.lisaaLaiteosa(virtalahde);
		
		kone.lisaaLaiteosa(kotelo);
		kone.lisaaLaiteosa(nappaimisto);
		kone.lisaaLaiteosa(hiiri);

		System.out.println("Koko koneen hinta: " + kone.kerroHinta());
		System.out.println("Kotelon kokohinta: " + kotelo.kerroHinta());
		System.out.println("Emolevyn kokonaishinta: " + emo.kerroHinta());
	}

}
