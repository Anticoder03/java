//Write a Java program to demonstrate the applications of various types of logical operators.
public class assignment2_5 {
    public static void main(String[] args) {
        int a = 20,b = 30;
        if (a > b && a < 10){
            System.out.println("Hello");
        } else if (a < b || a > 20) {
            System.out.println("Hii");
        } else if (!(a < b)) {
            System.out.println("Hey");
        }
    }
}
