
// Program to Track Inventory of Items
// Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.

import java.util.Scanner;

// Item class
class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for item
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Create Item object
        Item item = new Item(code, name, price);

        // Display item details
        item.displayItem();

        // Ask for quantity
        System.out.print("\nEnter quantity to purchase: ");
        int quantity = sc.nextInt();

        // Calculate total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);

        sc.close();
    }
}
