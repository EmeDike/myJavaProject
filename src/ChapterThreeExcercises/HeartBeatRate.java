package ChapterThreeExcercises;

import java.time.LocalDate;
import java.time.Period;

public class HeartBeatRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    public HeartBeatRate(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public int ageInYears() {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
    public int maximumHeartBeatRate() {
        return 220 - ageInYears();
    }
    public String targetHeartBeatRate() {
        int maxHeartRate = maximumHeartBeatRate();
        int lowerRange = (int) (0.5 * maxHeartRate);
        int upperRange = (int) (0.85 * maxHeartRate);
        return lowerRange + " - " + upperRange;
    }
}
