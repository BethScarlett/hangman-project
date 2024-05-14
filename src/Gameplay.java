import java.util.Scanner;

public class Gameplay {

    private String result;
    private static Boolean isOver;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static Boolean getOver() {
        return isOver;
    }

    public void setOver(Boolean over) {
        isOver = over;
    }

    public static boolean isGuessNumeric(String guess) {
        try {
            int checkGuess = Integer.parseInt(guess);
        }
        catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Player playerOne = new Player("", 8);


        while (playerOne.getLives() > 0) {
            Scanner userGuess = new Scanner(System.in);
            System.out.println("Please make a guess: ");

            String guess = userGuess.nextLine();
            while (guess.length() != 1) {
                System.out.println("Please only input one character at a time: ");
                guess = userGuess.nextLine();
            }
            char guessedLetter = guess.charAt(0);

            if (isGuessNumeric(guess) || !Character.isLetter(guessedLetter)) {
                System.out.println("Guess must be a letter!");
            } else {
                playerOne.setLives(playerOne.getLives() - 1);
                System.out.println("Guess is " + guess);
                System.out.println(playerOne.getLives());
            }

        }

        System.out.println("Game Over");
    }
}
