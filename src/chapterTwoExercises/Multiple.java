package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Multiple {

    public static boolean divide(int firstNumber, int secondNumber) {
        boolean isMultiple = false;
        int firstNumberTrippled = firstNumber * 3;
        int secondNumberDoubled = secondNumber * 2;
        if (firstNumberTrippled % secondNumberDoubled == 0) {
            isMultiple = true;
            return isMultiple;
        }
        else{
            return false;
        }
    }
}
