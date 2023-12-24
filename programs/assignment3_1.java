//Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Dog that overrides the makeSound() method to bark.
class Animal{
    public void makeSound(){
        System.out.println("Sound of the Animal");
    }
}
class Dog extends Animal{
    public void makeSound() {
        System.out.println("Bark.");
    }
}
public class assignment3_1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
    }
}
