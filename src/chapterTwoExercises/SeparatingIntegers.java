package chapterTwoExercises;

import java.util.Scanner;

public class SeparatingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIVE DIGIT INTEGER ");
        int number = input.nextInt();

        int firstInt = number / 10000;
        int secondInt = number / 1000 % 10;
        int thirdInt = number / 100 % 10;
        int fourthInt = number / 10 % 10;
        int fiftInt = number % 10;

        System.out.println(firstInt + " " + secondInt + " "  + thirdInt + " " + fourthInt + " " + fiftInt);


    }
}
