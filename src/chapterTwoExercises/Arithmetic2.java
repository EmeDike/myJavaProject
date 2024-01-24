package chapterTwoExercises;

public class Arithmetic2 {

    public static int calculateSquare(int firstNumber, int secondNumber) {
        int squareOfFirstNumber = firstNumber * firstNumber;
        int squareOfSecondNumber = secondNumber * secondNumber;
        return squareOfFirstNumber + squareOfSecondNumber;
    }

    public static int calDiffOfSquare(int firstNumber, int secondNumber) {
        int squareOfFirstNumber = firstNumber * firstNumber;
        int squareOfSecondNumber = secondNumber * secondNumber;
        int calDiffOfSquare = squareOfFirstNumber - squareOfSecondNumber;
        return calDiffOfSquare;
    }
}
