package GameElements;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import static CheckGuess.CheckGuess.compareGuess;
import static CheckGuess.ValidateGuess.isGuessNumeric;
import static GameElements.Difficulty.setDifficulty;
import static GameElements.HangmanASCII.drawHangman;
import static GameStates.Result.*;
import static GameStates.StartGame.startGame;

public class Gameplay {

    public static void main(String[] args) {
        //While player wants to start game
        while (startGame()) {
            //Create instance of player class
            Player playerOne = new Player("");

            //Set lives based on selected difficulty
            playerOne.setLives(setDifficulty());

            //Initialise GameElements.WordPicker
            WordPicker wordPicker = new WordPicker();

            //Set word to guess
            System.out.println("Choosing word to guess ...");
            wordPicker.chooseWord();
            System.out.println("Word chosen. Good luck.");

            //Store chosen word and lives for easier code reference
            String chosenWord = wordPicker.getChosenWord();
            int startingLives = playerOne.getLives();

            //Run game while player has lives left or word hasn't been guessed
            while (playerOne.getLives() > 0 && !String.join("", wordPicker.getHiddenWord()).equals(chosenWord)) {
                //System.out.println(wordPicker.getChosenWord());

                //Display information to player
                System.out.println(Arrays.toString(wordPicker.getHiddenWord()));
                System.out.println("So far you have guessed: " + playerOne.getGuessedLetters());
                System.out.println("Lives remaining: " + playerOne.getLives());

                //Initialise scanner to grab player input
                Scanner userGuess = new Scanner(System.in);
                System.out.println("Please make a guess: ");

                //Grab input and clean it
                String guess = userGuess.nextLine().toLowerCase();

                //Check if guess contains multiple characters
                while (guess.length() != 1) {
                    System.out.println("Please only input one character at a time: ");
                    guess = userGuess.nextLine();
                }

                //Check if guess is valid
                if (isGuessNumeric(guess) || !Character.isLetter(guess.charAt(0))) {
                    System.out.println("Guess must be a letter!");
                } else if (playerOne.getGuessedLetters().contains(guess)) {
                    System.out.println("You have already guessed this letter!");
                } else {
                    //Inform user of guess
                    System.out.println("You guessed " + guess);
                    //Check if guess is correct
                    if(compareGuess(guess.charAt(0), chosenWord, wordPicker.getHiddenWord())) {
                        //Inform user of correct guess
                        System.out.println("This is a correct guess.");
                    } else {
                        //Inform user of incorrect guess and deduct one life
                        System.out.println("This is an incorrect guess. Bad luck.");
                        playerOne.setLives(playerOne.getLives() - 1);
                    }
                    //Append guessed letters with latest guess
                    playerOne.setGuessedLetters(playerOne.getGuessedLetters() + guess.charAt(0) + ", ");

                    //Draw out character
                    drawHangman(startingLives - playerOne.getLives(), startingLives);
                }
            }
            //Display results message based on if player won or lost
            result(String.join("", wordPicker.getHiddenWord()).equals(chosenWord), chosenWord);
        }
        //Display goodbye message
        System.out.println("Ok no worries. Goodbye.");
    }
}
