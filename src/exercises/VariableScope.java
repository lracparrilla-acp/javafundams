package exercises;


public class VariableScope {

    public static int x = 3; //class variable

    public static void main(String[] args) {

        int x = 1; //local variable
        System.out.println(x);
        doSomething();
    }

    static void doSomething() {
        int x = 2; //local variable
        System.out.println(x);
    }
}
