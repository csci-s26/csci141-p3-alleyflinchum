import java.util.Random;
import java.util.Scanner;

public class BarboothGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("-- Barbooth dice-rolling game with two players --");
        System.out.println();

        // TODO 1: Ask for both player names
        String player1 = "";
        String player2 = "";

        // TODO 2: Roll one die for each player until one player gets a higher number
        String shooter = "";
        String fader = "";

        // TODO 3: Let the shooter roll two dice
        int die1 = 0;
        int die2 = 0;

        // TODO 4: Check whether the shooter wins, loses, or the fader gets a turn

        // TODO 5: If needed, let the fader roll two dice

        // TODO 6: Display the final result: shooter wins, fader wins, or tie

        input.close();
    }

    public static int rollDie(Random rand) {
        return 1; //TODO
    }

    public static boolean isWinningRoll(int die1, int die2) {
        return false; // TODO
    }

    public static boolean isLosingRoll(int die1, int die2) {
        return false; // TODO
    }
}
