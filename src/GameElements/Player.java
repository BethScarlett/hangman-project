package GameElements;

public class Player {

    //Initialise variables for the player
    private String guessedLetters;
    private int lives;

    //Constructor for player class
    public Player (String guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    //Getters and Setters for above
    public String getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(String guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
