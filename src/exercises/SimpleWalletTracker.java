package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleWalletTracker {
    //Check current wallet balance
    //Add money
    //Spend money
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0, inputMoney = 0;
        int choice = 0;
        boolean isRunning = true;
        System.out.println("********************");
        System.out.println("** Wallet Tracker **");
        System.out.println("********************\n");

        while (isRunning) {
            System.out.println("********************");
            System.out.println("Enter your choice: ");
            System.out.println("********************");
            System.out.println("1. Show Balance ");
            System.out.println("2. Add Money");
            System.out.println("3. Spend Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid choice! (1-4)");
                scanner.nextLine();
            }
            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    System.out.print("Enter money to be added to your wallet: ");
                    try {
                        inputMoney = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("You didnt enter a valid amount. Transaction cancelled.");
                        scanner.nextLine();
                        break;
                    }
                    balance = addMoney(balance, inputMoney);
                    break;
                case 3:
                    System.out.print("How much would you like to spend? ");
                    try {
                        inputMoney = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("You didnt enter a valid amount. Transaction cancelled.");
                        scanner.nextLine();
                        break;
                    }
                    balance = spendMoney(balance, inputMoney);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice (1-4): ");
                    break;
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    static double addMoney(double balance, double inputMoney) {
        if (inputMoney <= 0) {
            System.out.println("You cannot enter zero or negative money.");
            return balance;
        }
        balance += inputMoney;
        System.out.printf("Success! Your new balance is: $%.2f%n", balance);
        return balance;
    }

    static double spendMoney(double balance, double inputMoney) {
        if (inputMoney <= 0) {
            System.out.println("Transaction failed! Not enough balance.");
            return balance;
        }
        if (inputMoney > balance) {
            System.out.println("You cannot enter zero or negative money.");
            return balance;
        }
        balance = balance - inputMoney;
        System.out.printf("Success! Your new balance is $%.2f%n", balance);
        return balance;
    }
}
