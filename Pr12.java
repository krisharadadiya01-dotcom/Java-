class pr12 {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        pr12 obj = new pr12();

        // Cube
        double cubeVolume = obj.calculateVolume(4);
        System.out.println("Volume of Cube: " + cubeVolume);

        // Rectangular Cube
        double rectVolume = obj.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);

        // Sphere
        double sphereVolume = obj.calculateVolume(3f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
  
  }
//output:
//Volume of Cube: 64.0
//Volume of Rectangular Cube: 120.0
//Volume of Sphere: 113.09733552923255
