package exercises;

import java.util.Scanner;

public class BasicBanking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice = 0;
        System.out.println("***************");
        System.out.println("Banking Program");

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Enter your choice: ");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    double depositAmount;
                    System.out.println("Enter deposit amount: ");
                    depositAmount = scanner.nextDouble();
                    balance = deposit(depositAmount, balance);
                    break;
                case 3:
                    double withdrawAmount;
                    System.out.println("Enter withdrawal amount: ");
                    withdrawAmount = scanner.nextDouble();
                    balance = withdraw(withdrawAmount, balance);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.println("Current balance: $" + balance);
    }

    static double deposit(double depositAmount, double balance) {
        balance = depositAmount + balance;
        return balance;
    }

    static double withdraw(double withdrawAmount, double balance) {
        balance = balance - withdrawAmount;
        return balance;
    }
}
