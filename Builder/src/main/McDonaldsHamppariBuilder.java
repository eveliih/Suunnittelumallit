package main;

public class McDonaldsHamppariBuilder implements HamppariBuilder {
	
	 private StringBuilder hamppari;

	@Override
	public void luoHamppari() {
		hamppari = new StringBuilder();

	}

	@Override
	public void luoSampyla() {
		hamppari.append("Seesaminsiemensämpylä ");

	}

	@Override
	public void luoPihvi() {
		hamppari.append("Naudanlihapihvi ");

	}

	@Override
	public void luoMajo() {
		hamppari.append("McFeast ");

	}
	
	@Override
	public StringBuilder getBurger() {
		return hamppari;
	}

}
