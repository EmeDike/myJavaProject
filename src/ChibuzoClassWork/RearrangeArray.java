package ChibuzoClassWork;

public class RearrangeArray {

    public static int[] shuffleNumber(int[] numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            int temp = numbers[i];
            numbers[i] = numbers[counter];
            numbers[counter] = temp;
            counter += 2;
        }
        return numbers;
    }
}
