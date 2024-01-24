package ChapterFourExercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        double milesPerGallon;

        System.out.println("Enter miles driven and gallons used for each trip. Enter -1 to finish.");

        int tripNumber = 1;

        while (true) {
            System.out.printf("Trip %d - Enter miles driven (-1 to finish): ", tripNumber);
            int miles = scanner.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.printf("Trip %d - Enter gallons used: ", tripNumber);
            int gallons = scanner.nextInt();

            if (gallons == 0) {
                System.out.println("Gallons used must be greater than 0. Enter valid data.");
                continue;
            }

            milesPerGallon = (double) miles / gallons;

            System.out.printf("Trip %d - Miles per gallon: %.2f%n", tripNumber, milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double combinedMilesPerGallon = (double) totalMiles / totalGallons;

            System.out.printf("Combined miles per gallon for all trips: %.2f%n%n", combinedMilesPerGallon);

            tripNumber++;
        }

        System.out.println("Program ended.");
    }
}
