package chapterTwoExercises;

public class ComparingInteger {
    public static String compare(int number, int square) {
        boolean isLessThan = false;

        if (number < 100 && square < 100) {
            isLessThan = true;
        }
        return isLessThan ? "Both number and square are less than 100" : "At least one of them is not less than 100";
    }
}
