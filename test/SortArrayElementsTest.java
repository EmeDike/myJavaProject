import ChibuzoClassWork.SortArrayElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayElementsTest {
    @Test
    public void testThatWeCanSortOutElementsInAnArray() {
        int[] numbers = new int[]{5, 20, 4, 5, 1};
        int[] expected = new int[]{1, 4, 5, 5, 20};
        int[] result = SortArrayElements.sort(numbers);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
        assertEquals(expected[2], result[2]);
        assertEquals(expected[3], result[3]);
        assertEquals(expected[4], result[4]);
    }
}
