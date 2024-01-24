package ChapterThreeExcercises;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(22, 2, 50);

        System.out.println("Initial time is: " + clock.displayTime());

        clock.setHour(20);
        clock.setMinute(30);
        clock.setSecond(12);

        System.out.println("The time is: " + clock.displayTime());
    }
}
