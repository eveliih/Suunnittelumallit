package main;

public class Main {

	public static void main(String[] args) {
		CharmanderContex charmander = new CharmanderContex();
		AbraContex abra = new AbraContex();

		Visitor bonusVisitor = new BonusVisitor();

		System.out.println("Bonukset\nCharmander: " + charmander.getBonusPoints() + "\nAbra: " + abra.getBonusPoints() + "\n");

		for (int i = 0; i < 50; i++) {
			charmander.runPokemon();
			abra.runPokemon();
			charmander.flyPokemon();
			abra.flyPokemon();
			charmander.jumpPokemon();
			abra.jumpPokemon();

		}

		charmander.accept(bonusVisitor);
		abra.accept(bonusVisitor);

		System.out.println("Bonukset\nCharmander: " + charmander.getBonusPoints() + " (tila: "
				+ charmander.getPokemonState().getName() + ") \nAbra: " + abra.getBonusPoints() + " (tila: "
				+ abra.getPokemonState().getName() + ")");

	}

}
