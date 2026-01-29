package exercises;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;
        int numberOfTries = 0;

        System.out.println("Number Guessing Game");
        System.out.println("I have a number between 1 to 100 in mind");
        System.out.println("Try to guess it!");

        while (guess != randomNumber) {
            System.out.println("Enter your guess");
//            if (scanner.hasNextInt()) {
//                System.out.println("Its an integer");
//            }
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You have guessed the number.");
                System.out.println("Number of tries: " + numberOfTries);
            }
        }
        scanner.close();
    }
}
