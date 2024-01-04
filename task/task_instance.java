class Inst{
    String name = "Ashish";
    int num = 1;
}
class der extends  Inst{
    String place;
}
public class task_instance {
    public static void main(String[] args) {
        Inst obj = new Inst();
        System.out.println(obj instanceof Inst);
        System.out.println(obj instanceof Object);
        System.out.println(obj.name instanceof String);
        System.out.println(obj.name instanceof Object);

        der ob1 = new der();
        System.out.println(ob1 instanceof Inst);
        System.out.println(obj instanceof  der);

    }
}
