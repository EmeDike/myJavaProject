package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy3Test {
    @Test
    public void testThatNumberIsDivisibleBy3() {
        int number = 3;
        int divisor = 3;
        assertTrue(DivisibleBy3.divide(number, divisor));
    }
    @Test
    public void testThatNumberIsNotDivisibleBy3(){
        int number = 5;
        int divisor = 3;
        assertFalse(DivisibleBy3.divide(number, divisor));
    }
}

