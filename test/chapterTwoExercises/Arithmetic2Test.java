package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arithmetic2Test {

    @Test
    public void calculateSquares() {
        int firstNumber = 2;
        int secondNumber = 4;
        assertEquals(20, Arithmetic2.calculateSquare(firstNumber, secondNumber));
    }

    @Test
    public void calculateDifferenceOfSquares() {
        int firstNumber = 2;
        int secondNumber = 4;
        assertEquals(-12, Arithmetic2.calDiffOfSquare(firstNumber, secondNumber));
    }
}
