package main;

public class PokemonConnection {
	private Pokemon pokemon;
	private int runPoints = 0;
	private int jumpPoints = 0;
	private int flyPoints = 0;
	
	public PokemonConnection() {
		pokemon = Pikachu.getInstance();
	}
	
	public void runPokemon() {
		if(runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemon.changePokemon(this, Mew.getInstance());
		}
		if(runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemon.changePokemon(this, Bulbasaur.getInstance());
		}
		pokemon.run(this);
		runPoints++;
	}
	
	public void jumpPokemon() {
		if(runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemon.changePokemon(this, Mew.getInstance());
		}
		if(runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemon.changePokemon(this, Bulbasaur.getInstance());
		}
		pokemon.jump(this);
		jumpPoints++;
	}
	
	public void flyPokemon() {
		if(runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemon.changePokemon(this, Mew.getInstance());
		}
		if(runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemon.changePokemon(this, Bulbasaur.getInstance());
		}
		pokemon.fly(this);
		flyPoints++;
	}
	
	protected void changePokemon(Pokemon p) {
		pokemon = p;
	}

}
