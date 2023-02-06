package main;

import java.util.HashMap;
import java.util.Map;

public class SingletonPesukone {

	private Map<String, String> varauskirja;

	private SingletonPesukone() {
		varauskirja = new HashMap<>();
	}

	public Map<String, String> getVarauskirja() {
		return varauskirja;
	}

	public void varaaPyykkivuoro(String paivamaara, String kellonaika) {
		varauskirja.put(paivamaara, kellonaika);
	}

	private static SingletonPesukone INSTANCE = null;

	public static SingletonPesukone getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new SingletonPesukone();
		}
		return INSTANCE;
	}
}
