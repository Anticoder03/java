//Write a Java program that creates a class hierarchy for employees of a company.
//The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title.
//Implement methods for calculating bonuses, generating performance reports, and managing projects.
class Employee {
 ;    String name, address, jobTitle;
    double salary;
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public double calculateBonus() {
        return 0.0;
    }
    public String generatePerformanceReport() {
        System.out.println("Good");
        return "Performance report for " + name;
    }
    public void manageProject(String projectName) {
        System.out.println(jobTitle + " " + name + " is managing the project: " + projectName);
    }
}
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
    @Override
    public double calculateBonus() {
        return 0.1 * salary;
    }
}
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
    @Override
    public double calculateBonus() {
        return 0.05 * salary;
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
    @Override
    public double calculateBonus() {
        return 0.03 * salary;
    }
}

public class assignment3_3 {
    public static void main(String[] args) {
        // Example usage
        Manager manager = new Manager("ravi", "123 Main St", 80000.0);
        Developer developer = new Developer("Raj", "456 Oak St", 60000.0);
        Programmer programmer = new Programmer("Roshan", "789 Pine St", 50000.0);

        // You can now use the methods of the Employee and its subclasses
        System.out.println("Manager Bonus: $" + manager.calculateBonus());
        System.out.println("Developer Performance Report: " + developer.generatePerformanceReport());
        programmer.manageProject("Software Project X");
    }
}
