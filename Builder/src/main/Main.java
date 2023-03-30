package main;


public class Main {

	public static void main(String[] args) {
		HamppariBuilder hese = new HeseHamppariBuilder();
		HamppariBuilder mc = new McDonaldsHamppariBuilder();
		
		Tarjoilija tarjoilija = new Tarjoilija();
		
		tarjoilija.setHamppariBuilder(hese);
		tarjoilija.teeHamppari();
		
		System.out.println(hese.getBurger());
		
		tarjoilija.setHamppariBuilder(mc);
		tarjoilija.teeHamppari();
		
		System.out.println(mc.getBurger());
	}

}
