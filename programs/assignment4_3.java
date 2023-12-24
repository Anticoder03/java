// Interface Shape
interface shape {
    double getArea();
}
class Rectangle implements shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
class Square implements shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
class Triangle implements shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class assignment4_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        Square square = new Square(4);
        Triangle triangle = new Triangle(6, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
