package exercises;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        System.out.println("Enter your 1st number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter your operation (+, -, *, /, ^)");
        operator = scanner.next().charAt(0);
        System.out.println("Enter your 2nd number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {

                if (num1 == 0 || num2 == 0) {
                    System.out.println("Cannot divide by 0!");
                    validOperation = false;
                } else result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Not a valid operation!");
                validOperation = false;
            }

        }
        if (validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}
