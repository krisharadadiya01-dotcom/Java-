import java.io.*;

public class DataFileAnalysis {
    public static void main(String[] args) {

        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            // Open file for reading
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding spaces
                charCount += line.replaceAll("\\s", "").length();
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces/newlines): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt file not found.");

        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());

        } finally {
            // Close BufferedReader
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}
