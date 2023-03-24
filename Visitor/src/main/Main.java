package main;

public class Main {

	public static void main(String[] args) {
		CharmanderContex poke = new CharmanderContex();
		Visitor bonusVisitor = new BonusVisitor();
		
		
		System.out.println("bonukset: " + poke.getBonusPoints());
		for(int i = 0; i < 60; i++) {
			poke.runPokemon();
			poke.flyPokemon();
			poke.jumpPokemon();
			poke.accept(bonusVisitor);
		}
		
		
		System.out.println("bonukset: " + poke.getBonusPoints());
		
	}

}
