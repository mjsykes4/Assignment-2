package theDiceGame;

public class DiceGame {
	
	long seed = (new java.util.Date()).getTime();
	java.util.Random diceRoll = new java.util.Random(seed);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Game. Roll until you get a 1!");
		DiceGame aDiceGame = new DiceGame();
		int die = aDiceGame.diceRoll.nextInt(6)+1;
		int score = 0;
		while (die != 1) {
			score += die;
			die = aDiceGame.diceRoll.nextInt(6) + 1;
		System.out.println("Your dice score is "+score);
		}
	}
}
