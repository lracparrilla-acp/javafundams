package codingchallenges;


// computes weighted grade using arithmetic, (prelim @30%, midterm @30%, final @40%.)
// use a method getRemark(letter) that returns either Pass or Fail based on the letter.
// Use printf to show: Final grade: 87.33 (B) - Pass.

//Possible outputs:
//If user inputs 90 92 95: Final grade: 92.40 (A) - Pass
//If user inputs 50 40 30: Final grade: 39.00 (F) - Fail

import java.util.Scanner;

public class GradingHelper {

    public static void main(String[] args) {
        double prelimGrade, midtermGrade, finalGrade, weightedGrade;
        char letterGrade = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Prelim exam result (0-100): ");
        prelimGrade = scanner.nextDouble();
        System.out.print("Enter your Midterm exam result (0-100): ");
        midtermGrade = scanner.nextDouble();
        System.out.print("Enter your Final exam result (0-100): ");
        finalGrade = scanner.nextDouble();
        weightedGrade = ((prelimGrade * 0.3) + (midtermGrade * 0.3) + (finalGrade * 0.4));
        if (weightedGrade >= 0 && weightedGrade <= 100) {
            if (weightedGrade >= 90) {
                letterGrade = 'A';
            } else {
                if (weightedGrade >= 85) {
                    letterGrade = 'B';
                } else {
                    if (weightedGrade >= 75) {
                        letterGrade = 'C';
                    } else {
                        if (weightedGrade >= 70) {
                            letterGrade = 'D';
                        } else {
                            if (weightedGrade >= 60) {
                                letterGrade = 'E';
                            } else letterGrade = 'F';
                        }
                    }
                }
            }
        } else System.out.println("Invalid grade!");
        String passOrFail = getRemark(letterGrade);
        System.out.printf("Final grade: %.2f", weightedGrade);
        System.out.print(" (" + letterGrade + ") ");
        System.out.print("- " + passOrFail);
        scanner.close();
        return;
    }

    static String getRemark(char grade) {
        if (grade == 'F') {
            return "Fail";
        } else
            return "Pass";
    }
}
