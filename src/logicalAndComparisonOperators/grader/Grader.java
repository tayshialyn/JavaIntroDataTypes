package logicalAndComparisonOperators.grader;

import javax.naming.InsufficientResourcesException;

public class Grader {
    public int grade;

    // Create a constructor for class Grader to store passed-in value to grade
    public Grader(int grade) {
        this.grade = grade;
    }

    public String showGrade() {

        // create a variable to store the feedback
        String feedback = "";

        if (this.grade >= 0 && this.grade <= 3)
            feedback = "Failed";
        else if (this.grade > 3 && this.grade <= 5)
            feedback = "Insufficient";
        else if (this.grade > 5 && this.grade <= 8)
            feedback = "Good";
        else if (this.grade == 10)
            feedback = "Excellent";
        else
            feedback = "Invalid entry";

        return feedback;
    }
}
