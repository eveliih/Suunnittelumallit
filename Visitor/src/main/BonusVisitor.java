package main;

public class BonusVisitor implements Visitor {

	@Override
	public void visit(Charmander charmander, Contex c) {
		((CharmanderContex) c).setBonusPoints(((CharmanderContex) c).getBonusPoints() + 2);
		System.out.println("\n2 BONUSPOINTS++++\n");
		
	}

	@Override
	public void visit(Charmeleon charmeleon, Contex c) {
		((CharmanderContex) c).setBonusPoints(((CharmanderContex) c).getBonusPoints() + 5);
		System.out.println("\n5 BONUSPOINTS++++\n");
		
	}

	@Override
	public void visit(Charizard charizard, Contex c) {
		((CharmanderContex) c).setBonusPoints(((CharmanderContex) c).getBonusPoints() + 10);
		System.out.println("\n10 BONUSPOINTS++++\n");
		
	}

	@Override
	public void visit(Abra abra, Contex c) {
		((AbraContex) c).setBonusPoints(((AbraContex) c).getBonusPoints() + 5);
		System.out.println("\n5 BONUSPOINTS++++\n");
	}
		
	

	@Override
	public void visit(Kadabra kadabra, Contex c) {
		((AbraContex) c).setBonusPoints(((AbraContex) c).getBonusPoints() + 7);
		System.out.println("\n7 BONUSPOINTS++++\n");
		
	}

	@Override
	public void visit(Alakazam alakazam, Contex c) {
		((AbraContex) c).setBonusPoints(((AbraContex) c).getBonusPoints() + 15);
		System.out.println("\n15 BONUSPOINTS++++\n");
		
	}

}
