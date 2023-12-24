//Write a Java program that reads a number and displays the square, cube, and fourth power.
import java.util.Scanner;
public class assignment2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        System.out.println("Square of the number is: " + (Math.pow(num,2)));
        System.out.println("Cube of the number is: " + (Math.pow(num,3)));
        System.out.println("Fourth Power of the number is: " + (Math.pow(num,4)));

    }
}
