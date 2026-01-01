package basics;

/* Type Casting:
 * Sometimes you need to convert one type to another.
 * Widening = converting from a smaller type, to a larger type.
 * Narrowing = converting from a larger type to a smaller type. Requires explicit casting and risks data loss.
 *
 * Variable scope: defines where a variable can be accessed(!) Variables declared inside a method are local to that method(!).
 * Variables declared inside a class but outside methods are instance variables, accessible throughout the class.
 * Only instance variables get default values. Local variables must be initialized.
 * */

public class TypeCastingAndScope {
    //Class-level instance variable - accessible throughout the class.
    private String companyName = "MotorPH";

    public static void main(String[] args) {
        // ==== WIDENING (Automatic) ====
        // Converting from smaller type to larger type (safe, no data loss)

        byte smallNumber = 50;
        int mediumNumber = smallNumber; //Automatic widening
        long largeNumber = mediumNumber; //Automatic widening
        double veryLarge = largeNumber; //Automatic widening.

        System.out.println("Widening conversion: ");
        System.out.println("byte to int: " + mediumNumber);
        System.out.println("int to long: " + largeNumber);
        System.out.println("long to double: " + veryLarge);
        System.out.println();

//        ==== NARROWING (Manual, explicit) ====
//        Converting from larger type to smaller type (risky, possible data loss)

        double decimalValue = 99.99;
        int intValue = (int) decimalValue;
        byte byteValue = (byte) intValue;

        System.out.println("Narrowing conversion example: ");
        System.out.println("Original double: " + decimalValue);
        System.out.println("After casting to int: " + intValue); //notice decimal part is lost.
        System.out.println("After casting to byte " + byteValue);
        System.out.println();

//        ==== VARIABLE SCOPE DEMONSTRATION ====
        System.out.println("Variable Scope Example: ");
        if (true) {
            int blockScopedVariable = 100; //Local to this if block
            System.out.println("Inside if block: " + blockScopedVariable);
        }
        // blockScopedVariable is NOT accessible here - out of scope.
        // however, the instance variable (class-level) is accessible
        // through 'this' reference.
        TypeCastingAndScope example = new TypeCastingAndScope();
        System.out.println("Instance variable via object: " + example.companyName);

    }
}
