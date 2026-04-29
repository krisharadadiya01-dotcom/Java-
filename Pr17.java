interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    // Check pass or fail
    public boolean isPassed(int mark) {
        return mark >= 35;   // Passing marks = 35
    }

    // Check division based on average
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 35) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result student = new Result();

        int mark = 75;
        double average = 68.5;

        // Using Exam interface method
        if (student.isPassed(mark)) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        // Using Classify interface method
        System.out.println("Division: " + student.getDivision(average));
    }
}
