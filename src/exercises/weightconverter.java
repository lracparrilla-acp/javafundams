package exercises;

import java.util.Scanner;


/* weight converter. lets the user input whether they want to convert from kg to lbs, or vice versa. */

public class weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightlbs, weightkgs;
        int input;
        String choice;
        do {
            System.out.println("Weight Conversion Program");
            System.out.println("1: Convert lbs to kgs\n2: Convert kgs to lbs");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter the weight in lbs");
                weightlbs = scanner.nextDouble();
                weightkgs = weightlbs / 2.20462;
                System.out.println(weightlbs + " lbs converted to kgs is " + weightkgs);
                System.out.println("Do you wanna convert another number? enter Y to try or press any key to exit");
                choice = scanner.next();
            } else if (input == 2) {
                System.out.println("Enter the weight in kgs");
                weightkgs = scanner.nextDouble();
                weightlbs = weightkgs * 2.20462;
                System.out.println(weightkgs + " kgs converted to lbs is " + weightlbs);
                System.out.println("Do you wanna convert another number? enter Y to try or press any key to exit");
                choice = scanner.next();
            } else {
                System.out.println("Please enter 1 or 2");
                System.out.println("Do you wanna convert another number? enter Y to try or press any key to exit");
                choice = scanner.next();
            }
        } while (choice.equalsIgnoreCase("Y"));
        System.out.println("Program will close.");
        scanner.close();
    }
}

