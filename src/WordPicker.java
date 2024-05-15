import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class WordPicker {
    private String[] words = {"zipper", "nosy", "remember", "rambunctious", "descriptive", "special", "rainy", "bait",
            "painful", "insidious", "spotless", "seed", "rule", "oval", "sound", "tan", "interrupt", "used", "experience",
            "factory", "scary", "vulgar", "scoundrel", "mixed", "beef", "jam", "exciting", "rely", "account", "organic",
            "overwrought", "fax", "steel", "vacuous", "tedious", "giants", "old-fashioned", "little", "reason", "brain",
            "island", "faulty", "enjoy", "trip", "tame", "apparatus", "obnoxious", "babies", "mind", "arrive"};

    private String chosenWord;
    private String[] hiddenWord;

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

    public void chooseWord() {
        int randNum = ThreadLocalRandom.current().nextInt(0, 49);
        setChosenWord(words[randNum]);
        hideWord();
    }

    public void hideWord() {
        String[] letters = new String[getChosenWord().length()];
        Arrays.fill(letters, "_ ");
        setHiddenWord(letters);
        //System.out.println(Arrays.toString(letters));
    }

}
