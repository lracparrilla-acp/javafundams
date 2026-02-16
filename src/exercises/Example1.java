package basics;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * DataTypesExample
 * Demonstrates all eight primitive data types in Java.
 *
 */


public class Example1 {
    private int defaultInt;
    private double defaultDouble;
    private boolean defaultBoolean;
    private char defaultChar;

    public static void main(String[] args) {
        // byte: small integers, -128 to 127.
        byte age = 25;
        byte temperature = -10;
        System.out.println("Age (byte): " + age);
        System.out.println("Temperature (byte): " + temperature);
        System.out.println();

        // short: rarely used.
        short yearBorn = 1996;
        System.out.println("Year born (short): " + yearBorn);
        System.out.println();

        // int: most common for whole numbers
        int totalUsers = 1500000;
        int itemCount = 42;
        System.out.println("Total users (int): " + totalUsers);
        System.out.println("Item count (int): " + itemCount);
        System.out.println();

        long millisecondsSinceEpoch = System.currentTimeMillis();
        long bankBalance = 99999999999L;
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultDate = new Date(millisecondsSinceEpoch);
        Instant now = Instant.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
        String formattedDate =
                formatter.format(Instant.now());
        Clock nowIs = Clock.systemUTC();
        System.out.println("Milliseconds since epoch (long): " + millisecondsSinceEpoch);
        System.out.println("Clock is " + nowIs);
        System.out.println(sdf.format(resultDate));
        System.out.println("now is " + now);
        System.out.println(formattedDate);
        System.out.println("Bank balance (long): " + bankBalance);
        System.out.println();


        // float: single-precision (32-bit)
        float approximatePI = 3.14159f; //'f' suffix.
        System.out.println("Approximate PI (float): " + approximatePI);
        System.out.println();

        // double: double-precision (64-bit)
        double precisePI = 3.14159265359;
        double accountBalance = 15432.89;
        System.out.println("Precise PI (double) " + precisePI);
        System.out.println("Account balance (double): $" + accountBalance);
        System.out.println();

        // char: single Unicode character
        char firstLetter = 'A';
        char currency = '$';
        System.out.println("First letter (char): " + firstLetter);
        System.out.println("Currency symbol (char) " + currency);
        System.out.println();

        // boolean: logical true/false;
        boolean isEmployed = true;
        boolean hasLicense = false;

        System.out.println("Is employed? " + isEmployed);
        System.out.println("Has license? " + hasLicense);

    }
}
