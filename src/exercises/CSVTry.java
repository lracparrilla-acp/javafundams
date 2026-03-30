package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVTry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File file = null;
        try (scanner) {
            System.out.print("Enter employee ID: ");
            String employeeID = scanner.nextLine();
            file = new File("src\\employees.csv");
            Scanner search = new Scanner(file);
            boolean found = false;

            while (search.hasNextLine()) {
                String line = search.nextLine();
                String[] employeeData = line.split(",");

                if (employeeData[0].equals(employeeID)) {
                    for (int i = 1; i <= 3; i++) {
                        System.out.printf("%-15s ", employeeData[i]);
                        System.out.println();
                    }
                    found = true;
                    break;
                }
            }
            search.close();

            if (!found) {
                System.out.println("Employee #" + employeeID + " not found!");
                System.out.println("Goodbye!");
                System.exit(0);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find" + file + "make sure the file is in the project folder.");

        }
    }
}
