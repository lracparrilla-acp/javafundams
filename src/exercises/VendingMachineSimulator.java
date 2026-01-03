package exercises;

import java.util.Scanner;

public class VendingMachineSimulator {

    //Constants
    private static final int MAX_PURCHASE = 5;
    private static final double TAX_RATE = 0.12;
    private static final char CURRENCY = '₱';

    private static String[] productNames = {"Water", "Soda", "Chips", "Fries", "Hamburger"};
    private static double[] productPrice = {15, 25, 35, 45, 55};
    private static double userBalance;
    private static int itemSold;

    public VendingMachineSimulator(double balance) {
        userBalance = balance;
    }

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("========   Welcome to AffordaVend!   ========");
        System.out.println("=============================================");
        System.out.println();
        DisplayBalance(double cm);
        VendingMachineSimulator balance = new VendingMachineSimulator(customerMoney);
        DisplayProducts();


    }

    public static void DisplayProducts() {
        for (int i = 0; i <= 4; i++) {
            System.out.print(i + ". " + productNames[i] + " - ");
            System.out.println(CURRENCY + " " + String.format("%.2f", productPrice[i]));
            System.out.println();
        }
    }

    public static double DisplayBalance(double customerMoney) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        double customerMoney = scanner.nextDouble();
        System.out.println();
        return customerMoney;
    }

    //TODO:
}
