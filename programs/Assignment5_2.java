//2. Write a java program that implements the use of final keyword in:
//       a) variable
//       b) method
//       c) class
final class Final_class{
    final int final_var = 23;
    final public void final_method(){
        System.out.println("This is the final method.");
    }
}
public class Assignment5_2 {
    public static void main(String[] args) {
        Final_class obj = new Final_class();
        System.out.println(obj.final_var);
        obj.final_method();
    }
}
