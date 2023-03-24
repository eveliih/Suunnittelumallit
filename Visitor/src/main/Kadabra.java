package main;

public class Kadabra implements Pokemon {

	private static Kadabra INSTANCE = null;
	public static final String name = "Kadabra";

	public static Kadabra getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Kadabra();
		}
		return INSTANCE;
	}

	@Override
	public void run(Contex p) {
		System.out.println("Kadabra running...");
		
		
	}

	@Override
	public void jump(Contex p) {
		System.out.println("Kadabra jumping...");
		
		
	}

	@Override
	public void fly(Contex p) {
		System.out.println("Kadabra flying...");	
		
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
