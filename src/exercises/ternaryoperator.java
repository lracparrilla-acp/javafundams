package basics;

public class ternaryoperator {
    static void main() {
        int score1 = 70, checkOdd = 3;

//        if (score1 >= 70) {
//            System.out.println("You passed");
//        } else {
//            System.out.println("FAIL");
//        }
        String result = (score1 >= 70) ? "PASS" : "FAIL";
        System.out.println(result);

        result = (checkOdd % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);

    }
}