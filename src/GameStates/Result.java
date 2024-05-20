package GameStates;

public class Result {

    private static int winStreak = 0;

    public static void result(Boolean result, String word) {
        //Display game over message
        System.out.println("Game Over.");

        //Display win/loss result
        if(result) {
            System.out.println("Congratulations, you won!");
            winStreak += 1;
            System.out.println("Your current win streak is: " + winStreak);
        }
        else {
            System.out.println("Commiserations. You lost this time");
            System.out.println("Your win streak is over. You reached " + winStreak + " wins.");
            winStreak = 0;
        }

        //Show user what the word was
        System.out.println("The word was " + word);
    }
}
