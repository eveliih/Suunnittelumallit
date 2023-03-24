package main;

public class BonusVisitor implements Visitor {

	@Override
	public void visit(CharmanderContex charmanderContex) {
		Pokemon poke = charmanderContex.getPokemonState();
		String stateName = poke.getName();
		
		if(stateName.equals("Charmander")) {
			charmanderContex.setBonusPoints(charmanderContex.getBonusPoints() + 2);
			System.out.println("\n2 BONUSPOINTS++++\n");
		}
		
		else if(stateName.equals("Charmeleon")) {
			charmanderContex.setBonusPoints(charmanderContex.getBonusPoints() + 5);
			System.out.println("\n5 BONUSPOINTS++++\n");
		}
		else {
			charmanderContex.setBonusPoints(charmanderContex.getBonusPoints() + 10);
			System.out.println("\n10 BONUSPOINTS++++\n");
		}
		
	}



	

}
