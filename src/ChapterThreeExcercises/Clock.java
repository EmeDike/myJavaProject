package ChapterThreeExcercises;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        adjustTime();
    }

    public void setHour(int hour) {
        this.hour = hour;
        adjustTime();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        adjustTime();
    }

    public void setSecond(int second) {
        this.second = second;
        adjustTime();
    }

    private void adjustTime() {
        if (hour > 23 || minute > 59 || second > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public String displayTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
