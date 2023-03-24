package main;

public interface Pokemon{
	void run(CharmanderContex p);
	void jump(CharmanderContex p);
	void fly(CharmanderContex p);
	void changePokemon(CharmanderContex c, Pokemon p);
	String getName();
	//void accept(Visitor visitor);
}
