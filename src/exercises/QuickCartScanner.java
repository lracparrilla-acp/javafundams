package exercises;

import java.util.Scanner;  // Import the Scanner class to read user input

public class QuickCartScanner {
    public static void main(String[] args) {
        // Create a Scanner object to capture input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // === Collect user input ===
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();  // Reads a text value (string)

        System.out.print("Enter quantity sold today: ");
        int quantity = scanner.nextInt();  // Reads an integer value

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();  // Reads a decimal (double)

        System.out.print("Enter number of restocked items: ");
        int restockedItems = scanner.nextInt();  // Reads another integer

        // === Perform computations ===
        double totalCost = quantity * pricePerItem;  // Multiply quantity by price to get total cost
        int remainingStock = restockedItems - quantity;  // Subtract sold items from restocked items
        boolean lowStockAlert = remainingStock < 5;  // Check if remaining stock is below 5


        // === Display results ===
        System.out.println("\n=== QuickCart Sales Report ===");
        System.out.println("Product: " + productName);
        System.out.println("Total Cost: ₱" + totalCost);
        System.out.println("Remaining Stock: " + remainingStock);
        if (lowStockAlert) {
            System.out.println("Low Stock Alert: ⚠ Restock soon!");
        }

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}