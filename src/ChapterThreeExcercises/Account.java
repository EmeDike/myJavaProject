package ChapterThreeExcercises;

public class Account{
    private String name;
    private double balance;


    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit Successful");
        }else{
            System.out.println("Invalid Amount");
        }
    }
}