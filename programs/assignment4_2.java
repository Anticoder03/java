//Create a abstract class employee, having its properties & abstract function for calculating net salary and displaying the information.
// Drive manager & clerk class from this abstract class & implement the abstract method net
//salary and override the display method.
abstract class employee {
    protected String name;
    protected double basicSalary;
    public employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public abstract double calculateNetSalary();
    public abstract void displayInformation();
}
class manager extends employee {
    private double bonus;
    public manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateNetSalary() {
        return basicSalary + bonus;
    }
    @Override
    public void displayInformation() {
        System.out.println("Manager: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
class Clerk extends employee {
    private double overtimeHours;
    public Clerk(String name, double basicSalary, double overtimeHours) {
        super(name, basicSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateNetSalary() {
        return basicSalary + (overtimeHours * 10);
    }
    @Override
    public void displayInformation() {
        System.out.println("Clerk: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
public class assignment4_2 {
    public static void main(String[] args) {
        manager manager = new manager("Emp1", 50000, 10000);
        Clerk clerk = new Clerk("Emp2", 30000, 20);
        manager.displayInformation();
        System.out.println("--------------------");
        clerk.displayInformation();
    }
}
