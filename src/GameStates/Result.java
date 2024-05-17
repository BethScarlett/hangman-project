package GameStates;

public class Result {

    public static void result(Boolean result, String word) {
        //Display game over message
        System.out.println("GameStates Over.");

        //Display win/loss result
        if(result) System.out.println("Congratulations, you won!");
        else System.out.println("Commiserations. You lost this time");

        //Show user what the word was
        System.out.println("The word was " + word);
    }
}
