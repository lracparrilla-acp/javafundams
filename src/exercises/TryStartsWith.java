package exercises;

import java.util.Scanner;

public class TryStartsWith {
    static Scanner scanner = new Scanner(System.in);

    void main() {
        String name;
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Hello " + name.substring(0, 1).toUpperCase() + name.substring(1));
        //replace first char
    }
}
