import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("Distance in feet: %.2f\n", feet);

        sc.close();
    }
}

//output
//Enter distance in meters: 10
//Distance in feet: 32.81
