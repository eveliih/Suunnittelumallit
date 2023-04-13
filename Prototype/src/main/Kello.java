package main;

public class Kello implements Cloneable {
	Viisari iso;
	Viisari pieni;
	Viisari sekuntti;

	public Kello(int h, int min, int s) {
		this.iso = new Viisari(h);
		this.pieni = new Viisari(min);
		this.sekuntti = new Viisari(s);
	}

	public Kello(Viisari iso, Viisari pieni, Viisari sekuntti) {
		super();
		this.iso = iso;
		this.pieni = pieni;
		this.sekuntti = sekuntti;
	}

	public void asetaAika(int h, int min, int s) {
		iso.setAika(h);
		pieni.setAika(min);
		sekuntti.setAika(s);
	}

	//Syväkopiointi
	public Kello clone() {
		Kello k = null;
		try {
			k = (Kello) super.clone();
			k.iso = (Viisari) iso.clone();
			k.pieni = (Viisari) pieni.clone();
			k.sekuntti = (Viisari) sekuntti.clone();
		} catch (CloneNotSupportedException e) {

		}
		return k;
	}
	
	
	//Matalakopiointi
	/*public Kello clone() {
		Kello k = null;
		try {
			k = (Kello) super.clone();
		} catch (CloneNotSupportedException e) {

		}
		return k;
	}*/


	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", iso.getAika(), pieni.getAika(), sekuntti.getAika());
	}

}
