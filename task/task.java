class A{
    static int x = 23;
    static void display(){
        System.out.println("Inside the static method.");
    }
    void show(){
        System.out.println("Inside non static method.");
        display();

    }
}
public class task {
    public static void main(String[] args) {
        A ob = new A();
        A.display();
        System.out.println("The value of x is: " + A.x);
        ob.show();
    }
}
