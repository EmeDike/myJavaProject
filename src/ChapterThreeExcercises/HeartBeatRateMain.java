package ChapterThreeExcercises;

import java.util.Scanner;

public class HeartBeatRateMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the person's first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter the person's last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter the person's date of birth (in the format YYYY-MM-DD): ");
        String dateOfBirth = input.nextLine();

        HeartBeatRate heartBeatRate = new HeartBeatRate(firstName, lastName, dateOfBirth);

        System.out.println("Person's Information:");
        System.out.println("First Name: " + heartBeatRate.getFirstName());
        System.out.println("Last Name: " + heartBeatRate.getLastName());
        System.out.println("Date of Birth: " + heartBeatRate.getDateOfBirth());

        System.out.println("Age: " + heartBeatRate.ageInYears());
        System.out.println("Maximum Heart Rate: " + heartBeatRate.maximumHeartBeatRate());
        System.out.println("Target Heart Rate Range: " + heartBeatRate.targetHeartBeatRate());
    }
}
