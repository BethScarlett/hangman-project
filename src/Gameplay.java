import java.util.Arrays;
import java.util.Scanner;
import static CheckGuess.CheckGuess.compareGuess;
import static Game.Result.*;
import static Game.StartGame.startGame;

public class Gameplay {

    public static boolean isGuessNumeric(String guess) {
        try {
            Integer.parseInt(guess);
        }
        catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {

        //startGame();

        while (startGame()) {
            //Create instance of player object
            Player playerOne = new Player("", 1);

            //Initialise WordPicker
            WordPicker wordPicker = new WordPicker();

            //Set word to guess
            System.out.println("Choosing word to guess ...");
            wordPicker.chooseWord();
            System.out.println("Word chosen. Good luck.");

            //Store chosen word for easier reference
            String chosenWord = wordPicker.getChosenWord();

            //Use while loop to run game while player has lives left
            while (playerOne.getLives() > 0 && !String.join("", wordPicker.getHiddenWord()).equals(chosenWord)) {
                //System.out.println(wordPicker.getChosenWord());
                System.out.println(Arrays.toString(wordPicker.getHiddenWord()));

                //Initialise scanner to grab user input
                Scanner userGuess = new Scanner(System.in);
                System.out.println("Please make a guess: ");

                //TODO - Make this better

                //Grab input
                String guess = userGuess.nextLine();

                //Check if guess contains multiple characters
                while (guess.length() != 1) {
                    System.out.println("Please only input one character at a time: ");
                    guess = userGuess.nextLine();
                }

                //Check if guess is valid, and if user has made the same guess before
                if (isGuessNumeric(guess) || !Character.isLetter(guess.charAt(0))) {
                    System.out.println("Guess must be a letter!");
                } else if (playerOne.getGuessedLetters().contains(guess)) {
                    System.out.println("You have already guessed this letter!");
                } else {
                    //Check if guess is correct
                    System.out.println("You guessed " + guess);
                    if(compareGuess(guess.charAt(0), chosenWord, wordPicker.getHiddenWord())) {
                        //Inform user of correct guess
                        System.out.println("This is a correct guess");
                    } else {
                        //Inform user of incorrect guess and deduct one life
                        System.out.println("This is an incorrect guess. Bad luck.");
                        playerOne.setLives(playerOne.getLives() - 1);
                    }
                    //Output details of currently guessed letter, previously guessed letters and lived left
                    playerOne.setGuessedLetters(playerOne.getGuessedLetters() + guess.charAt(0) + ", ");
                    System.out.println("So far you have guessed: " + playerOne.getGuessedLetters());
                    System.out.println("Lives remaining: " + playerOne.getLives());
                }

            }
            //Display results message based on if player won or lost
            result(String.join("", wordPicker.getHiddenWord()).equals(chosenWord), chosenWord);
        }

        System.out.println("Goodbye");

    }
}
