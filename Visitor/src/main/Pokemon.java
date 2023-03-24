package main;

public interface Pokemon{
	void run(Contex p);
	void jump(Contex p);
	void fly(Contex p);
	void changePokemon(Contex c, Pokemon p);
	void accept(Visitor visitor, Contex c);
	String getName();
	
}
