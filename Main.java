public class Main {
    interface Shape {
        double calculateArea();
        double calculatePerimeter();
    //
    abstract class AbstractShape implements Shape {
        String color;
        double length;
        double width;
     // Constructor to initialize attributes
     public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Implementations for calculateArea() and calculatePerimeter() methods
    @Override
    public double calculateArea() {
        return 0; // Default implementation, to be overridden by subclasses
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Default implementation, to be overridden by subclasses
    }
}
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not needed for a circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle("Red", 5);
            Rectangle rectangle = new Rectangle("Blue", 4, 6);
    
            System.out.println("Circle Details:");
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());
    
            System.out.println("\nRectangle Details:");
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());

    }
}
