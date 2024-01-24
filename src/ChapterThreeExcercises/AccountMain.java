package ChapterThreeExcercises;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount1 = input.nextDouble();
        account1.deposit(depositAmount1);
        displayAccount(account1);

        System.out.println("Enter deposit amount for account2: ");
        double depositAmount2 = input.nextDouble();
        account2.deposit(depositAmount2);
        displayAccount(account2);
    }

    private static void displayAccount(Account account) {
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
    }
}
