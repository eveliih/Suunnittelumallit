package main;

public class Charmander implements Pokemon{
	private static Charmander INSTANCE = null;
	public static final String name = "Charmander";

	public static Charmander getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}

	@Override
	public void run(CharmanderContex p) {
		System.out.println("Charmander running...");
		
		
	}

	@Override
	public void jump(CharmanderContex p) {
		System.out.println("Charmander jumping...");
		
		
	}

	@Override
	public void fly(CharmanderContex p) {
		System.out.println("Charmander flying...");	
		
	}


	@Override
	public void changePokemon(CharmanderContex c, Pokemon p) {
		c.setPokemonState(p);
	}

	@Override
	public  String getName() {
		return name;
	}


}
