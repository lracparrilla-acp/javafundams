package exercises;

import java.util.Scanner;

// This program is for calculating how much an employee's SSS contribution will be
// * depending on their salary. From a base compensation of 3,250 with a base contribution of 135
// * and incrementing by 500 and 22.50, respectively.

public class ContributionCalculator {
    void main() {


        double baseThreshold = 3250.00;
        double baseContribution = 135.00;
        double stepSize = 500.00;
        double stepIncrement = 22.50;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();

        if (salary < baseThreshold) {
            System.out.println(baseContribution);
        } else {
            int steps = (int) Math.floor((salary - baseThreshold) / stepSize) + 1;
            double result = baseContribution + steps * stepIncrement;
            System.out.printf("₱%.2f%n", result);
        }

    }

}
