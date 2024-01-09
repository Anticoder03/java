//1.  Write a java program that implements the use of super keyword.
//      a) To refer immediate parent class instance variable.
//      b) To invoke immediate parent class method.
//      c)To invoke immediate parent class constructor.
//      d)Give suitable names of the class, variables and methods)
class Super{
    int id = 101;
    String name;
    public void display(){
        System.out.println("Hello This is Inside Super Class");
    }
    Super(String n){
        name = n;
        System.out.println("The Name Is: " + name);
    }
}
class Sub extends Super{
    Sub(String name){
        super(name);
        System.out.println("Access The Super Class Constructor");
        System.out.println("This is Inside Sub Class");
    }
    public void acc_super(){
        System.out.println("The Id Od Super Class Is: " + super.id);
        System.out.println("The Super Class Method is:");
        super.display();
    }
}
public class Assignment5_1 {
    public static void main(String[] args) {
        Sub obj = new Sub("Ashish");
        obj.acc_super();
    }
}
