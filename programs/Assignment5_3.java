//3. Write a java program that implements the use of abstract keyword.
//Your program must show that abstract methods cannot be declared in  a non abstract class.
//Your program must show that we cannot declare abstract methods as private or as static and an abstract keyword can
// never be used with variables and constructors.
//Also, your program must show that final keyword cannot be used with
//abstract keyword.
abstract class AbstractClass {
    abstract void abstractMethod();
    void nonAbstractMethod() {
        System.out.println("Non-abstract method in abstract class");
    }

    // Abstract method cannot be declared in a non-abstract class
    // Error: Abstract method in non-abstract class
    // abstract void errorMethod();
}

// Non-abstract class cannot contain abstract methods
// Error: Abstract method in non-abstract class
// class NonAbstractClass {
//     abstract void abstractMethod();
// }

class ConcreteClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Abstract method implemented in ConcreteClass");
    }
}
public class Assignment5_3 {
    public static void main(String[] args) {
        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.abstractMethod();
        concreteObj.nonAbstractMethod();
    }
}
