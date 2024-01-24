package chapterTwoExercises;

public class SmallestAndLargest2 {
    public static int smallest(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int smallestNumber = 1;
        if (secondNumber <= smallestNumber) {
            smallestNumber = secondNumber;
        } else if (thirdNumber <= smallestNumber) {
            smallestNumber = thirdNumber;
        }else if(fourthNumber <= smallestNumber){
            smallestNumber = fourthNumber;
        } else if (fifthNumber <= smallestNumber) {
            smallestNumber = fifthNumber;
        }
        return smallestNumber;
    }

    public static int largest(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int largestNumber = 10;
        if (firstNumber >= largestNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber >= largestNumber) {
            largestNumber = secondNumber;
        } else if (thirdNumber >= largestNumber) {
            largestNumber = thirdNumber;
        } else if (fourthNumber >= largestNumber) {
            largestNumber = fourthNumber;
        }
            else if (fifthNumber >= largestNumber) {
            largestNumber = fifthNumber;

        }
        return largestNumber;
        }
    }

