package main;

public class AbraContex implements Contex{
	private Pokemon pokemonState;
	private int runPoints = 0;
	private int jumpPoints = 0;
	private int flyPoints = 0;
	private int bonusPoints = 0;

	public AbraContex() {
		pokemonState = Abra.getInstance();
	}

	public void runPokemon() {
		if (runPoints >= 30 && jumpPoints > 30 && flyPoints > 8) {
			pokemonState.changePokemon(this, Kadabra.getInstance());
		}
		if (runPoints >= 80 && jumpPoints > 70 && flyPoints > 50) {
			pokemonState.changePokemon(this, Alakazam.getInstance());
		}
		pokemonState.run(this);
		runPoints++;
	}

	public void jumpPokemon() {
		if (runPoints >= 30 && jumpPoints > 30 && flyPoints > 8) {
			pokemonState.changePokemon(this, Kadabra.getInstance());
		}
		if (runPoints >= 80 && jumpPoints > 70 && flyPoints > 50) {
			pokemonState.changePokemon(this, Alakazam.getInstance());
		}
		pokemonState.jump(this);
		jumpPoints++;
	}

	public void flyPokemon() {
		if (runPoints >= 30 && jumpPoints > 30 && flyPoints > 8) {
			pokemonState.changePokemon(this, Kadabra.getInstance());
		}
		if (runPoints >= 80 && jumpPoints > 70 && flyPoints > 50) {
			pokemonState.changePokemon(this, Alakazam.getInstance());
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
