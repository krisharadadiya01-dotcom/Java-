class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Krisha", "IT");
        Employee m = new Manager("Riya", "Development", 5, "AI Project");

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}
//output:
//Employee Name: Krisha
//Department: IT

//Employee Name: Riya
//Department: Development
//Team Size: 5
//Project: AI Project
