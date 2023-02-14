package main;

public class Main {

	public static void main(String[] args) {
		PokemonConnection poke = new PokemonConnection();
		
		while(true) {
			poke.runPokemon();
			poke.flyPokemon();
			poke.jumpPokemon();
		}

	}

}
