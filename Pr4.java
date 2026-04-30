import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightKg = pounds * 0.45359237;
        double heightMeters = inches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI = " + bmi);
    }
}
//output
//Enter weight in pounds: 150
//Enter height in inches: 65
//BMI = 24.96
