package chapterTwoExercises;

public class TableOfSquaresAndCubes {
    public static void main(String[] args) {

        System.out.println("Number   \t   Square  \t     Root");
        for (int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;
            System.out.println(number + "      \t         " + square + " \t           " + cube);
        }
    }
}
