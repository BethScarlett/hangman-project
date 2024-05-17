import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static Utils.NumberUtils.generateRandNum;

public class WordPicker {

    //Create array of words to choose from
    private final String[] words = {"zipper", "nosy", "remember", "rambunctious", "descriptive", "special", "rainy", "bait",
            "painful", "insidious", "spotless", "seed", "rule", "oval", "sound", "tan", "interrupt", "used", "experience",
            "factory", "scary", "vulgar", "scoundrel", "mixed", "beef", "jam", "exciting", "rely", "account", "organic",
            "overwrought", "fax", "steel", "vacuous", "tedious", "giants", "vintage", "little", "reason", "brain",
            "island", "faulty", "enjoy", "trip", "tame", "apparatus", "obnoxious", "babies", "mind", "arrive"};

    //Initialise variables to store chosen word & hidden version of chosen word
    private String chosenWord;
    private String[] hiddenWord;

    //Getters and Setters for above
    public String getChosenWord() {
        return chosenWord;
    }

    public void setChosenWord(String chosenWord) {
        this.chosenWord = chosenWord;
    }

    public String[] getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String[] hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    //Choose random word from array
    public void chooseWord() {
        //Generate a random number within correct range
        int randNum = generateRandNum(0, words.length);

        //Set chosen word using random number as index
        setChosenWord(words[randNum]);

        hideWord();
    }

    //Hide chosen word
    public void hideWord() {
        //Create string array to hold hidden word
        String[] letters = new String[getChosenWord().length()];

        //Fill created array with underscores
        Arrays.fill(letters, "_ ");
        setHiddenWord(letters);
    }

}
