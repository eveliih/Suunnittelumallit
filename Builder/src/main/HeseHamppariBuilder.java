package main;

import java.util.ArrayList;
import java.util.List;

public class HeseHamppariBuilder implements HamppariBuilder {
	
	 private List<Object> hamppari;


	@Override
	public void luoHamppari() {
		hamppari = new ArrayList<Object>();

	}

	@Override
	public void luoSampyla() {
		hamppari.add(new Sampyla("Ruisleipä"));

	}

	@Override
	public void luoPihvi() {
		hamppari.add(new Pihvi("Kanapihvi"));

	}

	@Override
	public void luoMajo() {
		hamppari.add(new Majoneesi("Paprikamajoneesi"));

	}
	
	@Override
	public List<Object> getBurger() {
		return hamppari;
	}

}
