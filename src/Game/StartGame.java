package Game;

import java.util.Scanner;

public class StartGame {

    private static int choice;
    private static boolean isRestart;
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean startGame() {

        if(!isRestart) {
            //Welcome message for player
            System.out.println("Welcome to hangman! Would you like to play? Enter 1 for yes and anything else for no: ");
        } else System.out.println("Would you like to play again? Enter 1 for yes and anything else for no: ");

        try {
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Ok. Let's play.");
                isRestart = true;
                return true;
            }
            else {
//                System.out.println("Ok no worries. Goodbye.");
                return false;
            }
        } catch (Exception e) {
//            System.out.println("Ok no worries. Goodbye.");
            return false;
        }

    }

}
