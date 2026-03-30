package exercises;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        Scanner type = new Scanner(System.in);

        System.out.println("Input hours worked.");
        System.out.println();

        int hoursWorked = type.nextInt();

        if (hoursWorked < 0) {
            System.out.println("Invalid input!");
        } else if (hoursWorked == 0) {
            System.out.println("Employee did not work this week.");
        } else if (hoursWorked >= 1 && hoursWorked <= 40) {
            System.out.println("Regular work hours.");
        } else System.out.println("Employee has overtime");
    }
}
