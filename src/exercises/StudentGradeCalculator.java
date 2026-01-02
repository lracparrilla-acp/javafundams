package exercises;

/*
 * StudentGradeCalculator
 * A program that accepts a student's score in each category (quizzes, midterms, homework, final exam)
 * and calculates their final grade. Each student will get a letter grade, depending on their final grade.
 * Depending on their letter grade, they will also get a PASS/FAIL remark. You need at least D (>=60) to PASS.
 * Homework accounts for 20% of the final grade, quizzes 30%, midterm exam 20%, and final exam 30%.
 * 90-100 = A, 80-89 = B, 70-79 = C, 60-69 = D, <60 = F
 *
 * Constraints
 * All input scores must be between 0-100
 * Display all percentages with 2 decimal places (String formatting)
 * Use constants for all weight values and grade thresholds
 * Include proper variable names and comments
 */

import java.util.Scanner;

public class StudentGradeCalculator {

    // CONSTANTS

    // GRADING WEIGHT
    private static final double HOMEWORK_WEIGHT = 0.20;
    private static final double QUIZZES_WEIGHT = 0.30;
    private static final double MIDTERM_WEIGHT = 0.20;
    private static final double FINAL_WEIGHT = 0.20;

    // GRADING THRESHOLD
    private static final double GRADE_A_THRESHOLD = 90.0;
    private static final double GRADE_B_THRESHOLD = 80.0;
    private static final double GRADE_C_THRESHOLD = 70.0;
    private static final double GRADE_D_THRESHOLD = 60.0;
    private static final double PASSING_GRADE = 60.0;

    //GPA EQUIVALENTS
    private static final double GPA_A = 4.0;
    private static final double GPA_B = 3.0;
    private static final double GPA_C = 2.0;
    private static final double GPA_D = 1.0;
    private static final double GPA_F = 0.0;


    public static void main(String[] args) {
        System.out.println(" ========================================================== ");
        System.out.println(" ==============   STUDENT GRADE CALCULATOR   ============== ");
        System.out.println(" ========================================================== ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter your Homework score (1-100): ");
        double homeworkScore = scanner.nextDouble();
        System.out.print("Enter your Quiz score (1-100): ");
        double quizScore = scanner.nextDouble();
        System.out.print("Enter your Midterm exam score (1-100): ");
        double midtermScore = scanner.nextDouble();
        System.out.print("Enter your Final exam score (1-100): ");
        double finalScore = scanner.nextDouble();

        System.out.println("Name: " + studentName);
        System.out.println("Homework score: " + homeworkScore + " Final weight: " + String.format("%.2f", homeworkScore * HOMEWORK_WEIGHT));
        System.out.println("Quiz score: " + quizScore + " Final weight: " + String.format("%.2f", quizScore * QUIZZES_WEIGHT));
        System.out.println("Midterm score: " + midtermScore + " Final weight: " + String.format("%.2f", midtermScore * MIDTERM_WEIGHT));
        System.out.println("Final exam score: " + finalScore + " Final weight: " + String.format("%.2f", finalScore * FINAL_WEIGHT));
        double finalGrade = (homeworkScore * HOMEWORK_WEIGHT) + (quizScore * QUIZZES_WEIGHT) + (midtermScore * MIDTERM_WEIGHT) + (finalScore * FINAL_WEIGHT);
        System.out.println("Final Grade: " + String.format("%.2f", finalGrade));

        char letterGrade = ' ';

        if (finalGrade >= GRADE_A_THRESHOLD) {
            System.out.println("Letter Grade: A");
            letterGrade = 'A';

        } else if (finalGrade >= GRADE_B_THRESHOLD) {
            System.out.println("Letter Grade: B");
            letterGrade = 'B';
        } else if (finalGrade >= GRADE_C_THRESHOLD) {
            System.out.println("Letter Grade: C");
            letterGrade = 'C';
        } else if (finalGrade >= GRADE_D_THRESHOLD) {
            System.out.println("Letter Grade: D");
            letterGrade = 'D';
        }

        boolean isPassing = finalGrade >= PASSING_GRADE;
        String passFail = isPassing ? "PASS" : "FAIL";
        System.out.println(passFail);

        switch (letterGrade) {
            case 'A':
                System.out.println("GPA: " + GPA_A);
                break;
            case 'B':
                System.out.println("GPA: " + GPA_B);
                break;
            case 'C':
                System.out.println("GPA: " + GPA_C);
                break;
            case 'D':
                System.out.println("GPA: " + GPA_D);
                break;
            default:
                System.out.println("GPA :" + GPA_F);
        }
    }
}
