import java.util.Random;
import java.util.Scanner;

public class BarboothGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("-- Barbooth dice-rolling game with two players --");
		System.out.println();

		// TODO 1: Ask for both player names
		System.out.print("Player 1, please enter your name: ");
		String player1 = input.nextLine();
		System.out.print("Player 2, please enter your name: ");
		String player2 = input.nextLine();

		// TODO 2: Roll one die for each player until one player gets a higher number
		String shooter = "";
		String fader = "";


		while (true) {
			System.out.print(player1 + ", enter 'r' to roll: ");
			input.nextLine();
			int roll1 = rollDie(rand);
			System.out.println(player1 + ":" + roll1);

			System.out.print(player2 + ", enter 'r' to roll: ");
			input.nextLine();
			int roll2 = rollDie(rand);
			System.out.println(player2 + ":" + roll2);

			if (roll1 > roll2) {
				shooter = player1;
				fader = player2;
				break;
			} else if (roll2 > roll1) {
				shooter = player2;
				fader = player1;
				break;
			}
		}
		// TODO 3: Let the shooter roll two dice
		System.out.print(shooter + "starts first. Enter 'r' to roll: ");
		input.nextLine();
		int die1 = rollDie(rand);
		int die2 = rollDie(rand);
		System.out.println(shooter + ":" + die1 + "-" + die2);

		String result = "";



		// TODO 4: Check whether the shooter wins, loses, or the fader gets a turn

		if (isWinningRoll(die1, die2)) {
			result = shooter + " wins!";
		} else if (isLosingRoll(die1, die2)) {
			result = fader + " wins!";
			// TODO 5: If needed, let the fader roll two dice
		} else {
			System.out.print(fader + ", enter 'r' to roll: ");
			input.nextLine();
			int faderDie1 = rollDie(rand);
			int faderDie2 = rollDie(rand);
			System.out.println(fader + ": " + faderDie1 + " - " + faderDie2);

			if (isWinningRoll(faderDie1, faderDie2)) {
				result = fader + " wins!";
			} else if (isLosingRoll(faderDie1, faderDie2)) {
				result = shooter + " wins!";
			} else {
				result = "Tie!";
			}
		}
		// TODO 6: Display the final result: shooter wins, fader wins, or tie
		System.out.println(result);
		input.close();
	}


	public static int rollDie(Random rand) {
		return rand.nextInt(6) + 1;
	}

	public static boolean isWinningRoll(int die1, int die2) {
		return (die1 == 3 && die2 == 3) ||
				(die1 == 5 && die2 == 5) ||
				(die1 == 6 && die2 == 6) ||
				(die1 == 6 && die2 == 5) ||
				(die1 == 5 && die2 == 6);

	}


	public static boolean isLosingRoll(int die1, int die2) {
		return (die1 == 1 && die2 == 1) ||
				(die1 == 2 && die2 == 2) ||
				(die1 == 4 && die2 == 4) ||
				(die1 == 1 && die2 == 2) ||
				(die1 == 2 && die2 == 1);
	}
}
