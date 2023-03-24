
package main;

public class Alakazam implements Pokemon {

	private static Alakazam INSTANCE = null;
	public static final String name = "Alakazam";

	public static Alakazam getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Alakazam();
		}
		return INSTANCE;
	}

	@Override
	public void run(Contex p) {
		System.out.println("Alakazam running...");
		
		
	}

	@Override
	public void jump(Contex p) {
		System.out.println("Alakazam jumping...");
		
		
	}

	@Override
	public void fly(Contex p) {
		System.out.println("Alakazam flying...");	
		
	}


	@Override
	public void changePokemon(Contex c, Pokemon p) {
		c.setPokemonState(p);
	}

	@Override
	public  String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor, Contex c) {
		visitor.visit(this, c);
		
	}

}
