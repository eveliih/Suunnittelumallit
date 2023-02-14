package main;

public class Pikachu implements Pokemon{
	private static Pikachu INSTANCE = null;

	public static Pikachu getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Pikachu();
		}
		return INSTANCE;
	}

	@Override
	public void run(PokemonConnection p) {
		System.out.println("Pikachu running...");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void jump(PokemonConnection p) {
		System.out.println("Pikachu jumping...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void fly(PokemonConnection p) {
		System.out.println("Pikachu flying...");	
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void changePokemon(PokemonConnection c, Pokemon p) {
		c.changePokemon(p);
	}

	
}
