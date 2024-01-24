package ChapterThreeExcercises;

public class PetrolPurchase {

    //154 Chapter 3 Introduction to Classes, Objects, Methods and Strings
    //instance variables—the station’s location (type String), the type of petrol (type String), the quan-
    //tity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
    //(double). Your class should have a constructor that initializes the five instance variables. Provide a
    //set and a get method for each instance variable. In addition, provide a method named getPurchase-
    //Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
    //minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
    //cation class named Petrol that demonstrates the capabilities of class PetrolPurchase
    private String location;
    private String petrol;
    private int quantity;
    private double percentageDiscount;
    private double pricePerLiter;

    public PetrolPurchase(String location, String petrol, int quantity, double percentageDiscount, double pricePerLiter){
        this.location = location;
        this.petrol = petrol;
        this.quantity = quantity;
        this.percentageDiscount = percentageDiscount;
        this.pricePerLiter = pricePerLiter;
    }
    public double getPurchaseAmount() {
        double result = (quantity * pricePerLiter) * percentageDiscount;
        return result;


    }

    public String getLocation() {
        return location;
    }

    public String getPetrol() {
        return petrol;
    }

    public double getTotalDiscount() {
        double totalDiscount = quantity * pricePerLiter * 0.05;
        return totalDiscount;
    }
}
