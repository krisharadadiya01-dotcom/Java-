public class DivisionExample {
    public static void main(String[] args) {
        
        try {
            // Check if user entered exactly 2 arguments
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator as command-line arguments.");
            }

            // Convert command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result = " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}
