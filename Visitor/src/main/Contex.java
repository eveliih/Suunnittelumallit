package main;

public interface Contex {
	void accept(Visitor visitor);
	void setPokemonState(Pokemon p);
}
