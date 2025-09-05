// Program to Display Employee Details Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.


import java.util.Scanner;

// Employee class
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Main class
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking employee details as input
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Creating Employee object
        Employee emp = new Employee(name, id, salary);

        // Display employee details
        emp.displayDetails();

        sc.close();
    }
}
