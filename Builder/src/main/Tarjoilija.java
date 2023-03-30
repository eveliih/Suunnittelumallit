package main;

public class Tarjoilija {
	private HamppariBuilder hamppariBuilder;

	public void setHamppariBuilder(HamppariBuilder hamppariBuilder) {
		this.hamppariBuilder = hamppariBuilder;
	}
	
	public void teeHamppari() {
		hamppariBuilder.luoHamppari();
		hamppariBuilder.luoSampyla();
		hamppariBuilder.luoPihvi();
		hamppariBuilder.luoMajo();
	}
}
