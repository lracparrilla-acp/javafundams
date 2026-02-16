package exercises;

//method - a block of reusable code that is executed when called () aka function in other programming languages

public class MethodsRefresher {
    public static void main(String[] args) {

        String name = "Arcel";
        int age = 29;
        happyBirthday(name, age);
        double result = square(3);
        System.out.println(result);


    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday to you, %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }
}

