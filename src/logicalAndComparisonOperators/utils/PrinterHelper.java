package logicalAndComparisonOperators.utils;

public class PrinterHelper {

    public static void showMainMenu() {
        System.out.println("*----Check your grade----*");
        System.out.println("* Select an option:       ");
        System.out.println("* 1. Enter a grade       *");
        System.out.println("*2. Exit program         *");
        System.out.println("*------------------------*");
    }

    public static void showGradeMenu() {
        System.out.println("*----Enter a grade between 1 to 10----*");
    }

    public static void showGradeFeedback(String feedback) {
        System.out.println("*----Grade Result(s)----*");
        System.out.println(feedback);
    }

}
