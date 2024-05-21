package Utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class GenerateRandomNumberTest {

    @Test
    @DisplayName("Random number is in range")
    void generateRandNum_validInputs_numInRange() {
        int min = 1;
        int max = 5;
        int result = ThreadLocalRandom.current().nextInt(min, max);
        boolean inRange = result >= min && result <= max;
        assertTrue(inRange);
    }

    @Test
    @DisplayName("Handle greater bound exception gracefully")
    void generateRandNum_invalidInputs_switchInputs() {
        int min = 5;
        int max = 1;
        int result;
        try {
            result = ThreadLocalRandom.current().nextInt(min, max);
        } catch (Exception e) {
            result = ThreadLocalRandom.current().nextInt(max, min);
        }
        boolean inRange = result >= max && result <= min;
        assertTrue(inRange);
    }

    @Test
    @DisplayName("Handle greater bound exception gracefully if numbers are equal")
    void generateRandNum_equalInputs_incrementMax() {
        int min = 0;
        int max = 0;
        int result;
        try {
            result = ThreadLocalRandom.current().nextInt(min, max);
        } catch (Exception e) {
            max += 2;
            result = ThreadLocalRandom.current().nextInt(min, max);
        }
        boolean inRange = result >= min && result <= max;
        assertTrue(inRange);
    }
}