package main;

public class Viisari implements Cloneable {
	int aika;

	public Viisari(int aika) {
		super();
		this.aika = aika;
	}

	public int getAika() {
		return aika;
	}

	public void setAika(int aika) {
		this.aika = aika;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
