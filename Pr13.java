// Base class
class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

// Main class
public class pr13 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        // Initialize values
        t.getData(10, 5);   // base = 10, height = 5
        r.getData(4, 6);    // length = 4, width = 6

        // Display areas
        System.out.println("Area of Triangle = " + t.calculateArea());
        System.out.println("Area of Rectangle = " + r.calculateArea());
    }
}
//output:
//Area of Triangle = 25.0
//Area of Rectangle = 24.0
