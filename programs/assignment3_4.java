//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
//Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to
//calculate the area and perimeter of a circle.
class Shape{
    public void getPerimeter(){
        System.out.println("Perimeter is the length of the border of the shape.");
    }
    public void getArea(){
        System.out.println("Area is the space occupy by an object.");
    }
}
class Circle extends Shape{
    public void getPerimeter(int r) {
        double peri = 2 * 3.14 * r;
        System.out.println("Perimeter is: " + peri);
    }
    public void getArea(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area is: " + area);
    }
}
public class assignment3_4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getArea(14);
        c1.getPerimeter(7);
    }
}
