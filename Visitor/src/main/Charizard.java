package main;

public class Charizard implements Pokemon {
	private static Charizard INSTANCE = null;
	public static final String name = "Charizard";

	public static Charizard getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}

	@Override
	public void run(Contex p) {
		System.out.println("Charizard running...");
		
	}

	@Override
	public void jump(Contex p) {
		System.out.println("Charizard jumping...");
		
	}

	@Override
	public void fly(Contex p) {
		System.out.println("Charizard flying...");
		

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
