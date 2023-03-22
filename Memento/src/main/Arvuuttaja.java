package main;

public class Arvuuttaja {

	public Object liityPeliin(String nimi) {
		return new Memento(1 + (int) (Math.random() * ((10 - 1) + 1)), nimi);
	}

	public Integer tarkastaLuku(Object o, int arvaus) {
		
		Memento mem = (Memento) o;
		if (mem.luku == arvaus) {
			return mem.luku;

		}
		return 0;

	}

	private class Memento {
		private int luku;
		private String pelaajaNimi;

		public Memento(int luku, String pelaajaNimi) {
			super();
			this.luku = new Integer(luku);
			this.pelaajaNimi = pelaajaNimi;
		}
	}

}
