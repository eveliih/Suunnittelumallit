package main;

public class Charmeleon implements Pokemon {
	private static Charmeleon INSTANCE = null;
	public static final String name = "Charmeleon";

	public static Charmeleon getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}

	@Override
	public void run(CharmanderContex p) {
		System.out.println("Charmeleon running...");
	

	}

	@Override
	public void jump(CharmanderContex p) {
		System.out.println("Charmeleon jumping...");
		

	}

	@Override
	public void fly(CharmanderContex p) {
		System.out.println("Charmeleon flying...");
		

	}

	@Override
	public void changePokemon(CharmanderContex c, Pokemon p) {
		c.setPokemonState(p);

	}

	@Override
	public String getName() {
		return name;
	}


}
