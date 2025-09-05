// Program to Simulate Student Report
// Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
// To calculate the grade based on the marks.
// To display the student's details and grade.
// Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.

// Student class
class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    void displayReport() {
        System.out.println("\nStudent Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

// Main class
public class StudentReport {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Aman", 101, 92.5);
        Student s2 = new Student("Riya", 102, 78.0);
        Student s3 = new Student("Karan", 103, 56.0);
        Student s4 = new Student("Simran", 104, 35.5);

        // Displaying their reports
        s1.displayReport();
        s2.displayReport();
        s3.displayReport();
        s4.displayReport();
    }
}
