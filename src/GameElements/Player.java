package GameElements;

public class Player {

    //Initialise variables for the player
    private String guessedLetters;
    private int lives;

    //Constructors for player class
    public Player (String guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public Player (String guessedLetters, int lives) {
        this.guessedLetters = guessedLetters;
        this.lives = lives;
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
