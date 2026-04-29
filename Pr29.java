import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {
        
        // Creating ArrayList to store student marks
        ArrayList<Integer> marks = new ArrayList<>();

        // Adding 5 marks
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(68);
        marks.add(95);

        // Displaying all marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Finding highest and lowest marks
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        // Displaying results
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
