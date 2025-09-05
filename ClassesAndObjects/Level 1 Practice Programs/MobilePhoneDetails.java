// Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.

// MobilePhone class
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

// Main class
public class MobilePhoneDetails {
    public static void main(String[] args) {
        // Creating objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11R", 39999);

        // Displaying details
        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
