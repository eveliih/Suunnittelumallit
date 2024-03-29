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
	public void run(Contex p) {
		System.out.println("Charmeleon running...");
	

	}

	@Override
	public void jump(Contex p) {
		System.out.println("Charmeleon jumping...");
		

	}

	@Override
	public void fly(Contex p) {
		System.out.println("Charmeleon flying...");
		

	}

	@Override
	public void changePokemon(Contex c, Pokemon p) {
		c.setPokemonState(p);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor, Contex c) {
		visitor.visit(this, c);
		
	}


}
