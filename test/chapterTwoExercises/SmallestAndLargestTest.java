package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestAndLargestTest {
    @Test
    public void calculateAverage(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        assertEquals(4, SmallestAndLargest.average(firstNumber,secondNumber,thirdNumber));

    }

    @Test
    public void testThatAverageIsIntegerNotDouble(){
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber  = 6;
        assertEquals(4, SmallestAndLargest.average(firstNumber,secondNumber,thirdNumber));

    }
    @Test
    public void calculateProduct(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        assertEquals(48, SmallestAndLargest.product(firstNumber,secondNumber,thirdNumber));
    }
    @Test
    public void calculateSmallestNumber(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        assertEquals(2, SmallestAndLargest.smallest(firstNumber,secondNumber,thirdNumber));

    }

    @Test
    public void calculateLargestNumber(){
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber  = 6;
        assertEquals(6, SmallestAndLargest.largest(firstNumber,secondNumber,thirdNumber));

    }

}