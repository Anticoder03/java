//Write a Java program to convert minutes into years and days.
import java.util.Scanner;
public class Assignment2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Minutes: ");
        int min = sc.nextInt();
        System.out.println("Years = " + (min / 525600));
        System.out.println("Days = " + (min / 1440));
    }

}
