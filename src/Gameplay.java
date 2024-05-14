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

    public static void main(String[] args) {
        Player playerOne = new Player("", 8);

        while (playerOne.getLives() > 0) {
            Scanner userGuess = new Scanner(System.in);
            System.out.println("Please make a guess: ");

            String guess = userGuess.nextLine();
            System.out.println("Guess is " + guess);

            playerOne.setLives(playerOne.getLives() - 1);
        }

        System.out.println("Game Over");
    }
}
