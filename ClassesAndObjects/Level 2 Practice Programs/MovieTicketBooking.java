// Program to Model a Movie Ticket Booking System
// Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
// Display ticket details.
// Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.


// MovieTicket.java
import java.util.Scanner;

// Class to represent a Movie Ticket
class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; // Not booked yet
        this.price = 0.0;
    }

    // Method to book a ticket
    void bookTicket(int seatNumber, double price) {
        if (this.seatNumber == -1) { // Check if seat not already booked
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("✅ Ticket booked successfully!");
        } else {
            System.out.println("❌ Ticket already booked for seat " + this.seatNumber);
        }
    }

    // Method to display ticket details
    void displayTicket() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet for movie: " + movieName);
        } else {
            System.out.println("🎬 Movie: " + movieName);
            System.out.println("💺 Seat Number: " + seatNumber);
            System.out.println("💰 Price: ₹" + price);
        }
    }
}

// Main class
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();

        // Create ticket object
        MovieTicket ticket = new MovieTicket(movie);

        // Book ticket
        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);

        // Display ticket
        ticket.displayTicket();

        sc.close();
    }
}

