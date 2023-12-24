//Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
import java.util.Scanner;
public class Assignment2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature: ");
        double f = sc.nextDouble();
        double c = 0.55555555556*(f - 32);
        System.out.println("Celsius degrees is: " + c);
    }
}
