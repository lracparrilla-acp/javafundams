package basics;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;


        while (!valid) {
            System.out.print("Enter a number between 1 and 100: ");

            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= 100) {
                    valid = true;
                } else {
                    System.out.println("Number must be between 1 and 100. TRY AGAIN!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Number must be between 1 and 100. TRY AGAIN!");
            }

        }
        System.out.println("You entered: " + number);
        scanner.close();

    }
}
