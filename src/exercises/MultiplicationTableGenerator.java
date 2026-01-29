package exercises;

import java.util.Scanner;

public class MultiplicationTableGenerator {
    /* Multiplication Table Generator. Prompt the user to enter an integer and the program will generate a multiplication table.
     * Example input: Enter a number: 3
     * Example output:
     * 1 x 1 = 1
     * 1 x 2 = 2
     * 1 x 3 = 3
     *
     *
     * 2 x 1 = 2
     * 2 x 2 = 4
     * 2 x 3 = 6
     *
     *
     * 3 x 1 = 3
     * 3 x 2 = 6
     * 3 x 6 = 9
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int result = 0;
        for (int left = 1; left <= input; left++) {
            for (int right = 1; right <= input; right++) {
                System.out.println(left + "x" + right + "=" + left * right);
            }
            System.out.println();
            System.out.println();
        }

        scanner.close();
    }
}
