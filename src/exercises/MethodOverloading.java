package exercises;


// overloaded methods
// can share the same name, but they need to have a different set of parameters
// method signature = method name + method parameters !!

public class MethodOverloading {
    public static void main(String[] args) {

        String pizza = bakePizza("thin crust", "parmesan", "Hawaiian");
        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
