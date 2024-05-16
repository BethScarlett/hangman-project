package CheckGuess;

public class CheckGuess {

    public static boolean compareGuess(char guessedLetter, String chosenWord, String[] hiddenWord) {
        if(chosenWord.indexOf(guessedLetter) != -1) {
            int index = chosenWord.indexOf(guessedLetter);
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
