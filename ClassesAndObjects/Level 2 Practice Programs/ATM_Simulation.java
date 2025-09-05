// Program to Simulate an ATM
// Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
// Depositing money.
// Withdrawing money (only if sufficient balance exists).
// Displaying the current balance.
// Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.

import java.util.Scanner;

// BankAccount class
class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main ATM Simulation
public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample bank account
        BankAccount account = new BankAccount("Rahul Sharma", "ACC12345", 5000.0);

        int choice;
        do {
            // ATM Menu
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
