package exercises;

import java.util.Scanner;

/* Create a simple vending machine simulator.
 * The program should track products,prices, user balance,and purchases using basic Java concepts.
 *
 */
public class VendingMachineSimulator {

    //Constants
    private static final int MAX_PURCHASE = 5;
    private static final double TAX_RATE = 0.12;
    private static final char CURRENCY = '₱';

    private static String[] productNames = {"Water", "Soda", "Chips", "Fries", "Hamburger"};
    private static double[] productPrices = {15, 25, 35, 45, 55};
    private static double userBalance = 100;
    private static int itemsSold;

    public VendingMachineSimulator(double balance, String[] productName, double[] productPrice) {
        userBalance = balance;
        productNames = productName;
        productPrices = productPrice;
    }

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("====  Vending Machine Simulator  ====");
        System.out.println("=====================================\n");
        System.out.println("Initial Balance: " + VendingMachineSimulator.userBalance);
        displayProducts();
    }

    public static void displayProducts() {
        System.out.println("\nAvailable Products:");
        System.out.println("----------------------------------------");
        for (int i = 0; i < productNames.length && i < productPrices.length; i++) {
            System.out.print(i + 1 + ".     " + productNames[i] + " - " + "₱" + productPrices[i] + "0\n");

        }
        System.out.println("----------------------------------------");
        purchaseItem();

    }

    public static void purchaseItem() {
        Scanner scanner = new Scanner(System.in);
        int buyerChoice = 1;
        boolean valid = false;

        while (!valid) {
            System.out.print("\nEnter a number to purchase: (0 to exit) ");
            try {
                buyerChoice = Integer.parseInt(scanner.nextLine());
                if (buyerChoice >= 1 && buyerChoice <= productNames.length) {
                    valid = true;
                }
                if (buyerChoice == 0) {
                    displaySummary();
                    return;
                } else {
                    System.out.println("Please choose from the menu. Try again! Or press 0 to exit");
                }
            } catch (NumberFormatException e) {
                System.out.println("Pleas choose from the menu. Try again! Or press 0 to exit");
            }
        }
        double price = productPrices[buyerChoice - 1];
        double tax = price * TAX_RATE;
        double total = price + tax;
        System.out.println("\nProcessing purchase....");
        System.out.println("Purchased " + productNames[buyerChoice - 1]);
        System.out.println("Tax applied: ₱" + String.format("%.2f", tax));
        System.out.println("Total cost: ₱" + String.format("%.2f", total));
        userBalance = userBalance - total;
        itemsSold += 1;
        displayBalance();

    }

    public static void displayBalance() {
        System.out.println("Your current balance: ₱" + String.format("%.2f", userBalance));
        purchaseItem();

    }

    public static void displaySummary() {
        System.out.println("Total purchased items: " + itemsSold);
    }
}
//TODO: REFACTOR ASAP (!!!)