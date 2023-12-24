class Demo{
//    Class Variable.
    int x = 20;
    //Static variable.
    static int n = 30;
    Demo(){
        //local variable.
        int a = 20;
        System.out.println("Local Variable is a : " + a);
        System.out.println("Class Variable is x : " + x);
        System.out.println("Static Variable is n: " + n);
    }
}
public class assignment1_3 {
    public static void main(String[] args) {
        //Instance Variable.
        Demo d1 = new Demo();
    }
}
