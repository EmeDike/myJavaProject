package ChapterThreeExcercises;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("Station A", "Regular", 50, 5.5, 250 );
        System.out.println("Name of Location is: " + purchase.getLocation());
        System.out.println("Name of petrol  is: " + purchase.getPetrol());
        System.out.println("Quantity of petrol is: " + purchase.getPetrol());
        System.out.println("Discount on total amount of fuel purchased is: " + purchase.getTotalDiscount());
        System.out.println("Net purchase Amount is: " + purchase.getPurchaseAmount());

    }
}
