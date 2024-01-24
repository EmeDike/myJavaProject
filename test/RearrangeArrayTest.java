import ChibuzoClassWork.RearrangeArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RearrangeArrayTest {
    @Test
    public void testThatIcanSortOutNumber(){
        int[] numbers = {43, 42, 56, 67, 89, 99, 60};
        int[] numbersAfterShuffle = {42, 43, 67, 56, 99, 89, 60};
        assertArrayEquals(numbersAfterShuffle, RearrangeArray.shuffleNumber(numbers));
    }

}