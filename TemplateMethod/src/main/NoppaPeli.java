package main;

public class NoppaPeli extends Game{
	private int[] playerPoints;
	private int winner = -1;
	
	@Override
	void initializeGame() {
		System.out.println("Noppapeli alkaa!");
		playerPoints = new int[playersCount];
	}

	@Override
	void makePlay(int player) {
		System.out.println("Pelaaja "+ player + " heittää noppaa...");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int random = 1 + (int)(Math.random() * ((6 - 1) + 1));
		System.out.println("Nopasta tuli: " + random);
		playerPoints[player] = playerPoints[player] + random;
		System.out.println("Pelaajan " + player + " pisteet: " + playerPoints[player] + "\n");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	boolean endOfGame() {
		for(int i = 0; i < playersCount; i++) {
			if(playerPoints[i] > 24) {
				playerPoints[i] = 0;
			}
			else if(playerPoints[i] == 24) {
				winner = i;
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Pelaaja " + winner + " voitti noppapelin!");
	}

}
