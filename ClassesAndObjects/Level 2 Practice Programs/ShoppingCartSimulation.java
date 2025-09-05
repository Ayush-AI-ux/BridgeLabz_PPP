// Program to Simulate a Shopping Cart
// Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
// Add an item to the cart.
// Remove an item from the cart.
// Display the total cost.
// Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.


// ShoppingCartSimulation.java
import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Cart Item
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this item
    double getCost() {
        return price * quantity;
    }

    // Display item details
    void displayItem() {
        System.out.println(itemName + " | Price: ₹" + price + " | Quantity: " + quantity + " | Total: ₹" + getCost());
    }
}

// Class to manage the shopping cart
class ShoppingCart {
    ArrayList<CartItem> cartItems = new ArrayList<>();

    // Add item to the cart
    void addItem(String name, double price, int quantity) {
        cartItems.add(new CartItem(name, price, quantity));
        System.out.println("✅ " + name + " added to cart.");
    }

    // Remove item from the cart
    void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).itemName.equalsIgnoreCase(name)) {
                cartItems.remove(i);
                found = true;
                System.out.println("❌ " + name + " removed from cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("⚠️ Item not found in cart.");
        }
    }

    // Display all items and total cost
    void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("🛒 Cart is empty.");
            return;
        }

        System.out.println("\n--- Shopping Cart ---");
        double totalCost = 0;
        for (CartItem item : cartItems) {
            item.displayItem();
            totalCost += item.getCost();
        }
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("---------------------\n");
    }
}

// Main class
public class ShoppingCartSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("1. Add Item\n2. Remove Item\n3. View Cart\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("🛒 Exiting Shopping Cart. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Try again.");
            }
        }
    }
}


