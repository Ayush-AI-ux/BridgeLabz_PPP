// Program to Check Palindrome String
// Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
// Display the result.
// Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.


// PalindromeChecker.java
import java.util.Scanner;

// Class to check palindrome
class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Not palindrome
            }
            start++;
            end--;
        }
        return true; // Palindrome
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}

// Main class
public class PalindromeCheckerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Display result
        checker.displayResult();

        sc.close();
    }
}
