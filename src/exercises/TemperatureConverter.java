package exercises;

import java.util.Scanner;


public class TemperatureConverter {

    private static final double FAHRENHEIT_MULTIPLIER = 9.0 / 5.0;
    private static final int CELSIUS_OFFSET = 32;

    public static void main(String[] args) {

        double temperatureCelsius = 0;
        double temperatureFahrenheit = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========TEMPERATURE CONVERTER=========");
        System.out.println("Enter 1 to convert Celsius to Fahrenheit, and 2 to convert Fahrenheit to Celsius");

        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Enter the Value of your Celsius");
            temperatureCelsius = scanner.nextDouble();
            double toFahrenheit = (temperatureCelsius * 9 / 5) + 32;
            System.out.println("You entered " + temperatureCelsius + "Celsius.\nConverted to Fahrenheit, " + String.format("%.2f", toFahrenheit) + " °F");
        } else if (input == 2) {
            System.out.println("Enter the Value of your Fahrenheit");
            temperatureFahrenheit = scanner.nextDouble();
            double toCelsius = (temperatureFahrenheit - 32) * 5 / 9;
            System.out.println("You entered " + temperatureFahrenheit + "Fahrenheit.\nConverted to Celsius, " + String.format("%.2f", toCelsius) + " °C");
        } else System.out.println("You entered an invalid value!");


    }


}
