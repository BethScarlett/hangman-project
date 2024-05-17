package GameStates;

import java.util.Scanner;

public class StartGame {

    //Initialise required variable and scanner
    private static boolean isRestart;
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean startGame() {

        //Check if game has been started before
        if(!isRestart) {
            //Welcome message
            System.out.println("Welcome to hangman! Would you like to play? Enter 1 for yes and anything else for no: ");
            isRestart = true;
        } else {
            //Restart message
            System.out.println("Would you like to play again? Enter 1 for yes and anything else for no: ");
        }

        //Attempt to grab input
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                //Return true to start game
                System.out.println("Ok. Let's play.");
                return true;
            }
            else {
                //Return false to end game
                return false;
            }
        } catch (Exception e) {
            //Return false if invalid input
            return false;
        }

    }

}
