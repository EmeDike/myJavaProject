package chapterTwoExercises;

public class SmallestAndLargest {
    public static int average(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        return average;
    }

    public static int product(int firstNumber, int secondNumber, int thirdNumber) {
        int product = firstNumber * secondNumber * thirdNumber;
        return product;
    }

    public static int smallest(int firstNumber, int secondNumber, int thirdNumber) {
        int smallestNumber = firstNumber;
        if (secondNumber <= smallestNumber) {
            smallestNumber = secondNumber;
        } else if (thirdNumber <= smallestNumber) {
            smallestNumber = thirdNumber;
        }

        return smallestNumber;


        }

    public static int largest(int firstNumber, int secondNumber, int thirdNumber) {
        int largestNumber = thirdNumber;
        if (firstNumber >= largestNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber >= largestNumber) {
            largestNumber = secondNumber;
        } else if (thirdNumber <= largestNumber) {
            largestNumber = thirdNumber;
        }

        return largestNumber;


    }
}
