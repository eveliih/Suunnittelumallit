package main;

public class CharmanderContex implements Contex {
	private Pokemon pokemonState;
	private int runPoints = 0;
	private int jumpPoints = 0;
	private int flyPoints = 0;
	private int bonusPoints = 0;

	public CharmanderContex() {
		pokemonState = Charmander.getInstance();
	}

	public void runPokemon() {
		if (runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemonState.changePokemon(this, Charmeleon.getInstance());
		}
		if (runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemonState.changePokemon(this, Charizard.getInstance());
		}
		pokemonState.run(this);
		runPoints++;
	}

	public void jumpPokemon() {
		if (runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemonState.changePokemon(this, Charmeleon.getInstance());
		}
		if (runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemonState.changePokemon(this, Charizard.getInstance());
		}
		pokemonState.jump(this);
		jumpPoints++;
	}

	public void flyPokemon() {
		if (runPoints >= 50 && jumpPoints > 40 && flyPoints > 10) {
			pokemonState.changePokemon(this, Charmeleon.getInstance());
		}
		if (runPoints >= 100 && jumpPoints > 80 && flyPoints > 50) {
			pokemonState.changePokemon(this, Charizard.getInstance());
		}
		pokemonState.fly(this);
		flyPoints++;
	}

	@Override
	public void setPokemonState(Pokemon p) {
		pokemonState = p;
	}

	public Pokemon getPokemonState() {
		return pokemonState;
	}

	@Override
	public void accept(Visitor visitor) {
		pokemonState.accept(visitor, this);

	}

	public int getBonusPoints() {
		return bonusPoints;
	}

	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}

}
