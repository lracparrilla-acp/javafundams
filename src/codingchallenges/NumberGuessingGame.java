package codingchallenges;


import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50 + 1);
        int guessNumber = 0;
        int numberOfTries = 7;
        boolean hasWon = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-50.");
        System.out.println("Can you guess it within 7 tries?");

        while (numberOfTries != 0) {
            System.out.println("Enter your guess (1-50)");
            try {
                guessNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a number from 1-50.");
                scanner.next();
                continue;
            }
            if (guessNumber < 1 || guessNumber > 50) {
                System.out.println("Enter a number from 1-50 only!");
            } else {
                if (randomNumber > guessNumber) {
                    System.out.println("My number is higher than your guess.");
                } else if (randomNumber < guessNumber) {
                    System.out.println("My number is lower than your guess.");
                } else {
                    hasWon = true;
                    break;
                }
                numberOfTries--;
                if (numberOfTries != 0)
                    System.out.println("Tries remaining: " + numberOfTries);

            }
        }
        if (hasWon) {
            System.out.print("Your guess is correct! Number of tries: " + (7 - numberOfTries + 1));
        } else System.out.println("Game over! My number is " + randomNumber);
    }
}
