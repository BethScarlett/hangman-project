package Utils;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

    public static int generateRandNum (int min, int max) {
        if (min > max) return ThreadLocalRandom.current().nextInt(max, min);
        else if (min == max) {
            max += 1;
            return ThreadLocalRandom.current().nextInt(min, max);
        }
        else return ThreadLocalRandom.current().nextInt(min, max);
    }
}
