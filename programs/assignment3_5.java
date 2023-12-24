//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle,
//with subclasses Truck, Car and Motorcycle.Each subclass should have properties such as make, model,
//year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public double calculateFuelEfficiency() {
        return 0.0;
    }
    public double calculateDistanceTraveled(double fuelEfficiency, double fuelConsumed) {

        return fuelEfficiency * fuelConsumed;
    }
    public int getMaxSpeed() {
        return 0;
    }
}
class Truck extends Vehicle {
       @Override
    public double calculateFuelEfficiency() {
        double fuel_eff = 3.2;
        return fuel_eff;
    }
    @Override
    public int getMaxSpeed() {
        int max_speed = 120;
        return max_speed;
    }
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
class Car extends Vehicle {
    @Override
    public double calculateFuelEfficiency() {
        double fuel_eff = 4.1;
        return fuel_eff;
    }
    @Override
    public int getMaxSpeed() {
        int max_speed = 140;
        return max_speed;
    }
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends Vehicle {
    @Override
    public double calculateFuelEfficiency() {
        double fuel_eff = 5;
        return fuel_eff;
    }
    @Override
    public int getMaxSpeed() {
        int max_speed = 160;
        return max_speed;
    }
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
public class assignment3_5 {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F150", 2022, "Gasoline");
        Car car = new Car("Toyota", "Camry", 2023, "Hybrid");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Gasoline");
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Fuel Efficiency: " + truck.calculateDistanceTraveled(truck.calculateFuelEfficiency(), 46));
        System.out.println("Truck Fuel Efficiency: " + truck.getMaxSpeed());
        System.out.println("Car Distance Traveled: " + car.calculateFuelEfficiency());
        System.out.println("Car Distance Traveled: " + car.calculateDistanceTraveled(25.0, 10.0));
        System.out.println("Car Distance Traveled: " + car.getMaxSpeed());
        System.out.println("Motorcycle Max Speed: " + motorcycle.getMaxSpeed());
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateFuelEfficiency());
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateDistanceTraveled(motorcycle.calculateFuelEfficiency(), 50));
    }
}
