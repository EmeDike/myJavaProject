package ChapterThreeExcercises;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double applyDiscountToCar1(double discountPercentage) {
        if (discountPercentage > 0) {
            double discountedAmount = price * (discountPercentage / 100);
            return price - discountedAmount;
        } else {
            return price;
        }
    }
    public double applyDiscountToCar2(double discountPercentage) {
        if (discountPercentage > 0) {
            double discountedAmount = price * (discountPercentage / 100);
            return price - discountedAmount;
        } else {
            return price;
        }
    }
}