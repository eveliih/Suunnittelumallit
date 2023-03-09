package main;

public abstract class Kasittelija {
	private Kasittelija seuraavaKasittelija;

	public void setSeuraavaKasittelija(Kasittelija kasittelija) {
		this.seuraavaKasittelija = kasittelija;
	}

	public void kasittelePyynto(PalkankorotusPyynto request) {
		if (seuraavaKasittelija != null)
			seuraavaKasittelija.kasittelePyynto(request);
	}
}
