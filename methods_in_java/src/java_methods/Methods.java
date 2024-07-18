package java_methods;

import java.util.Scanner; // Import the Scanner class

public class Methods {
    // Main method where the program starts
    public static void main(String[] args) {
        findLargestAndSmallest(); // Call the method to run it
    }

    // Method to find and display the largest and smallest numbers
    public static void findLargestAndSmallest() {
        
        // Asking the user to enter three numbers
        try (java.util.Scanner numberInputScanner = new Scanner(System.in) // Create a Scanner object to read input
        ) {
            // Asking the user to enter three numbers
            System.out.println("Enter the first number: ");
            int num1 = numberInputScanner.nextInt(); // Read the first number
            System.out.println("Enter the second number: ");
            int num2 = numberInputScanner.nextInt(); // Read the second number
            System.out.println("Enter the third number: ");
            int num3 = numberInputScanner.nextInt(); // Read the third number
            // Determine the largest number
            int largest = num1; // Assume num1 is the largest
            if (num2 > largest) {
                largest = num2; // Update largest if num2 is larger
            }   if (num3 > largest) {
                largest = num3; // Update largest if num3 is larger
            }   // Determine the smallest number
            int smallest = num1; // Assume num1 is the smallest
            if (num2 < smallest) {
                smallest = num2; // Update smallest if num2 is smaller
            }   if (num3 < smallest) {
                smallest = num3; // Update smallest if num3 is smaller
            }   // Display the results
            System.out.println("The smallest number: " + smallest);
            System.out.println("The largest number: " + largest);
            System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
            // Close the scanner
        }
    }
}

