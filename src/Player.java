public class Player {
    private String guessedLetters;
    private int lives;

    public Player (String guessedLetters, int lives) {
        this.guessedLetters = guessedLetters;
        this.lives = lives;
    }

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
