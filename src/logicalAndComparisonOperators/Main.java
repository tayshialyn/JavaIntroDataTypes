package logicalAndComparisonOperators;

import logicalAndComparisonOperators.grader.Grader;

import logicalAndComparisonOperators.utils.PrinterHelper;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    /*
    Objective is to track the following inputs:
    1. "Failed" if they scored 3 or less
    2. "Insufficient" fif the scored > 3 but less than 5. (5 included)
    3. "Good" if they scored > 5 but less than 8. (8 included)
    4. "Excellent" if they scored 10
    5. Provide, feedback, if participants enter a negative number or a number outside the range (outside 0-10)
    */

    public static void main(String[] args) {

        // Initialise option to start with a int of 0
        int option = 0;
        int grade = 0;

        // Create instance of a Scanner object
        // Use 'System.in' connects to the keyboard to capture user input when the program executes

        Scanner scanner = new Scanner(System.in);

        // Do while user does not type in a value of 2 (exit program)
        do {
            PrinterHelper.showMainMenu();
            option = scanner.nextInt();

            // showGradeMenu() asks for the user grade, stored in variable grade
            PrinterHelper.showGradeMenu();
            grade = scanner.nextInt();

            // create and instance of Grader to store the grade
            // print out the grade by calling method showGrade()
            Grader grader = new Grader(grade);
            PrinterHelper.showGradeFeedback(grader.showGrade());

            // exit the program after grade is displayed
            exit(0);

        } while (option != 2);

        System.out.println("Thank you and good bye.");
    }
}
