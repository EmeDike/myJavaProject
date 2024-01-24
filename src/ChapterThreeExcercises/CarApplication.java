package ChapterThreeExcercises;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "2007", 2000000.00);
        Car car2 = new Car("Peugeot", "1995", 950000.00);

        System.out.println("Original Price of Car1: $" + car1.getPrice());
        System.out.println("Original Price of Car2: $" + car2.getPrice());

        double discountPercentageCar1 = 5.0;
        double discountPercentageCar2 = 7.0;

        double discountedPriceCar1 = car1.applyDiscountToCar2(discountPercentageCar1);
        double discountedPriceCar2 = car2.applyDiscountToCar1(discountPercentageCar2);

        System.out.println("Discounted Price of Car1: $" + discountedPriceCar1);
        System.out.println("Discounted Price of Car2: $" + discountedPriceCar2);
    }
}
