package chapterTwoExercises;

import java.util.Scanner;

public class NegativeAndPositiveValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeInteger = 0;
        int positiveInteger = 0;
        int zeroCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number to read : ");
            int number = input.nextInt();

            if (number == 0) {
                zeroCount++;
            } else if (number < 0) {
                negativeInteger++;
            } else if (number > 0) {
                positiveInteger++;
            }
        }

        System.out.println("Total number of Negative Integers is: " + negativeInteger);
        System.out.println("Total number of Positive Integers is: " + positiveInteger);
        System.out.println("Total number of Zero Integers is: " + zeroCount);
    }
}
