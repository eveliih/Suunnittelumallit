package main;

public class Mew implements Pokemon{
	private static Mew INSTANCE = null;

	public static Mew getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Mew();
		}
		return INSTANCE;
	}

	@Override
	public void run(PokemonConnection p) {
		System.out.println("Mew running...");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void jump(PokemonConnection p) {
		System.out.println("Mew jumping...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void fly(PokemonConnection p) {
		System.out.println("Mew flying...");
		try {
			Thread.sleep(100);
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

