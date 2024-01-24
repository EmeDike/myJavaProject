package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    @Test
    public void calculateSumOfTwoIntegers(){
        int firstNumber = 2;
        int secondNumber = 4;
        assertEquals(6, Arithmetic.sumOfTwoIntegers(2, 4));

    }

    @Test
    public void calculateSumOfTwoNegativeIntegers(){
        int firstNumber = -2;
        int secondNumber = -4;
        assertEquals(-6, Arithmetic.sumOfTwoIntegers(-2, -4));

    }
}