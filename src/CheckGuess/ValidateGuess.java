package CheckGuess;

public class ValidateGuess {
    //Check if user has guessed a number
    public static boolean isGuessNumeric(String guess) {
        //Attempt to convert guess into an int
        try {
            Integer.parseInt(guess);
        }
        catch (NumberFormatException nfe) {
            //Return false if unable to convert guess
            return false;
        }

        return true;
    }
}
