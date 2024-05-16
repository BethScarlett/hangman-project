package CheckGuess;

public class CheckGuess {

    public static boolean compareGuess(char guessedLetter, String chosenWord, String[] hiddenWord) {
        if(chosenWord.indexOf(guessedLetter) != -1) {
            System.out.println("Letter exists in word");
            int index = chosenWord.indexOf(guessedLetter);
            while (index >= 0) {
                //System.out.println(index);
                hiddenWord[index] = String.valueOf(guessedLetter);
                index = chosenWord.indexOf(guessedLetter, index + 1);
            }
            return true;
        } else {
            System.out.println("This letter does not appear in the word");
            return false;
        }
        //System.out.println(guessedLetter + " is the guess.  The word to guess is " + chosenWord);
    }

    //Checks if guessed letter exists on chosen word
    //If yes it should replace all instances of _ in hidden word with the guessed letter and display "Correct"
    //If not it should deduct one life from the player and display "Incorrect"
}
