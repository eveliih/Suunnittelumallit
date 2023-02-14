package main;

public class Bulbasaur implements Pokemon{
	private static Bulbasaur INSTANCE = null;

	public static Bulbasaur getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Bulbasaur();
		}
		return INSTANCE;
	}

	@Override
	public void run(PokemonConnection p) {
		System.out.println("Bulbasaur running...");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void jump(PokemonConnection p) {
		System.out.println("Bulbasaur jumping...");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fly(PokemonConnection p) {
		System.out.println("Bulbasaur flying...");
		try {
			Thread.sleep(500);
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
