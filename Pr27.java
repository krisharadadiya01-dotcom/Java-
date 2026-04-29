import java.io.*;

public class StudentFileExample {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing student records to file
            fw = new FileWriter("students.txt");

            fw.write("101, Krisha, 85\n");
            fw.write("102, Raj, 90\n");
            fw.write("103, Priya, 88\n");

            System.out.println("Student records written successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing FileWriter.");
            }
        }

        try {
            // Reading student records from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
}
