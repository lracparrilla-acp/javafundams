package codingchallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleATMMenu {
    public static void main(String[] args) {

        //declaration
        double balance = 0, amount = 0;
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple ATM Menu");

        //continue loop while user doesnt choose 0.

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            try {
                choice = scanner.nextInt(); //scan user input.
            } catch (InputMismatchException e) {
                System.out.println("Enter 1-3 or 0. Try again!");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your deposit amount: ");
                    amount = scanner.nextDouble();
                    balance = deposit(balance, amount);
                }
                case 2 -> {
                    System.out.println("Enter your withdrawal amount: ");
                    amount = scanner.nextDouble();
                    balance = withdraw(balance, amount);
                }
                case 3 -> checkBalance(balance);
                case 0 -> {
                    return;
                }
                default -> System.out.println("Enter 1-3 or 0. Try again!");
            }

        } while (choice != 0);

        scanner.close();
    }

    static double deposit(double balance, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return balance;
        } else
            balance += amount;
        System.out.println("Success! Your new balance is $" + balance);
        return balance;
    }

    static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Invalid withdrawal amount. Insufficient funds!");
            return balance;
        } else
            balance -= amount;
        System.out.println("Withdrawal successful! New balance is $" + balance);
        return balance;
    }

    static void checkBalance(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }
}


