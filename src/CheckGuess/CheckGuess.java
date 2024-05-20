package CheckGuess;

public class CheckGuess {

    //Check if user's guess was correct
    public static boolean compareGuess(char guessedLetter, String chosenWord, String[] hiddenWord) {
        //Check if guessed letter exists in chosen word
        if(chosenWord.indexOf(guessedLetter) != -1) {
            //Create variable using index of guessed letter in the chosen word
            int index = chosenWord.indexOf(guessedLetter);

            //Replace instances of underscore with guessed letter in hidden word
            while (index >= 0) {
                hiddenWord[index] = String.valueOf(guessedLetter);
                index = chosenWord.indexOf(guessedLetter, index + 1);
            }
            return true;
        } else {
            return false;
        }
    }
}
