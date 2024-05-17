package Game;

public class Result {

    public static void result(Boolean result, String word) {
        System.out.println("Game Over.");
        if(result) System.out.println("Congratulations, you won!");
        else System.out.println("Commiserations. You lost this time");
        System.out.println("The word was " + word);
    }
}
