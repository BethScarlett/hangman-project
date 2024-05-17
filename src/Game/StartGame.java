package Game;

import java.util.Scanner;

public class StartGame {

    private static int choice;

    public static boolean startGame() {
        Scanner scanner = new Scanner(System.in);

        //Welcome message for player
        System.out.println("Welcome to hangman! Would you like to play? Enter 1 for yes and any other number for no: ");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            System.out.println("Ok. Let's play.");
            return true;
        }
        else {
            return false;
        }
    }
}
