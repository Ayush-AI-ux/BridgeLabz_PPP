// Program to Compute Area of a Circle
// Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.


import java.util.Scanner;

// Circle class
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
}

// Main class
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking radius as input
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Creating Circle object
        Circle c = new Circle(radius);

        // Display area and circumference
        c.displayDetails();

        sc.close();
    }
}
