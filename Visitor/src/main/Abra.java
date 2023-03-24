package main;

public class Abra implements Pokemon {

	private static Abra INSTANCE = null;
	public static final String name = "Abra";

	public static Abra getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Abra();
		}
		return INSTANCE;
	}

	@Override
	public void run(Contex p) {
		System.out.println("Abra running...");
		
		
	}

	@Override
	public void jump(Contex p) {
		System.out.println("Abra jumping...");
		
		
	}

	@Override
	public void fly(Contex p) {
		System.out.println("Abra flying...");	
		
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
