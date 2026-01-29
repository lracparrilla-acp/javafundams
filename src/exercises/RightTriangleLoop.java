package exercises;

import java.util.Scanner;

public class RightTriangleLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int input = scanner.nextInt();
        int i, j;

        for (i = input; i >= 1; i--) {
            for (j = i; j <= input; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }


}
