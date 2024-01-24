package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleTest {

    @Test
    public void testThatFirstNumberTrippled_IsAMultipleOfTheSecondNumberDoubled() {
        int firstNumber = 2;
        int secondNumber = 3;
        assertTrue(Multiple.divide(firstNumber, secondNumber));

    }

    @Test
    public void testThatFirstNumberTrippled_IsNotAMultipleOfTheSecondNumberDoubled() {
        int firstNumber = 8;
        int secondNumber = 7;
        assertFalse(Multiple.divide(firstNumber, secondNumber));

    }
}