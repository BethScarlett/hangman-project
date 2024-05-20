package GameElements;

import java.util.Scanner;

public class Difficulty {

    public static int setDifficulty() {
        System.out.println("Select difficulty. 1 for easy, 2 for normal and 3 for hard: ");
        Scanner difficultySelector = new Scanner(System.in);
        int difficulty;
        try {
                difficulty = difficultySelector.nextInt();
                while (difficulty < 1 || difficulty > 3){
                    System.out.println("Invalid selection. Please select a number between 1 & 3: ");
                    difficulty = difficultySelector.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Error with selection. Defaulting to normal difficulty ... ");
                difficulty = 2;
            }

            if (difficulty == 1) return 12;
            else if (difficulty == 3) return 4;
            else return 8;
    }
}
