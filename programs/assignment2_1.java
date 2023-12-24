//Write a Java program that accepts two integers from the user and prints the sum, the difference, the product,
// the average, the distance (the difference between the integers), the maximum (the largest of the two integers),
//and the minimum (the smallest of the two integers).
import java.util.Scanner;
public class assignment2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("The Sum is: " + (num1 + num2));
        System.out.println("The Difference is: " + (num1 - num2));
        System.out.println("The Average Is: "+ ((num1+num2)/2));
        System.out.println("The distance is: " + (num1 - num2));
        System.out.println("The maximum number is: " + (Math.max(num1,num2)));
        System.out.println("The minimum number is: " + (Math.min(num1,num2)));


    }
}
