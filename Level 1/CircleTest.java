public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        System.out.println("\nCircle1 radius: " + c1.getRadius() + ", Area: " + c1.getArea());
        System.out.println("Circle2 radius: " + c2.getRadius() + ", Area: " + c2.getArea());
    }    
}

class Circle {
    private double radius;

    public Circle() {
        this(1.0);  
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
