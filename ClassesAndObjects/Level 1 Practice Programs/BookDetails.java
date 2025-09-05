// Program to Handle Book Details
// Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.


import java.util.Scanner;

// Book class
class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

// Main class
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        // Creating Book object
        Book book = new Book(title, author, price);

        // Display book details
        book.displayDetails();

        sc.close();
    }
}
