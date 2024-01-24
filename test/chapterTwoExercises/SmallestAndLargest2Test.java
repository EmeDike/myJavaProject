package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestAndLargest2Test {
    @Test
    public void testThatNumberAmongstTheIntegerIsTheSmallest(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        int fourthNumber = 1;
        int fifthNumber = 10;
        assertEquals(1, SmallestAndLargest2.smallest(firstNumber,secondNumber,thirdNumber,fourthNumber, fifthNumber));

    }
    @Test
    public void testThatNumberAmongstTheIntegerIsTheLargest(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        int fourthNumber = 1;
        int fifthNumber = 10;
        assertEquals(10, SmallestAndLargest2.largest(firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber));
    }
}
