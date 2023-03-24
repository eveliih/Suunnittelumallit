package main;

public interface Visitor {
	void visit(Charmander charmander, Contex c);
	void visit(Charmeleon charmeleon, Contex c);
	void visit(Charizard charizard, Contex c);
	void visit(Abra abra, Contex c);
	void visit(Kadabra kadabra, Contex c);
	void visit(Alakazam alakazam, Contex c);

}
