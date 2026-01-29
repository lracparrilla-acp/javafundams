package exercises;

import java.util.Scanner;

public class OddOrEvenCounter {
    // Ask the user to input n amount of integers. Count how many are odd, and how many are even, then display the result.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int input;
        System.out.println("Odd or even counter.");
        System.out.println("Input how many numbers");
        quantity = scanner.nextInt();
        while (quantity > 0) {
            System.out.println("Enter " + quantity + " more number/s");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }
                quantity--;
            } else {
                System.out.println("Invalid input! Try again!");
                scanner.next();
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        scanner.close();
    }
}
