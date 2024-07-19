package School;

import java.util.Scanner;

public class MarksCalculator {
    

    // Method to enter marks and calculate the average
    public static void enterMarksAndCalculateAverage() {
        // Prompt the lecturer to enter marks for three units
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the lecturer to enter marks for three units
            System.out.print("Enter marks for Java Programming: ");
            double javaMarks = scanner.nextDouble();
            
            System.out.print("Enter marks for Networking: ");
            double networkingMarks = scanner.nextDouble();
            
            System.out.print("Enter marks for Maths: ");
            double mathsMarks = scanner.nextDouble();
            
            // Calculate the average marks
            double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;
            
            // Output the marks and average in the specified format
            System.out.println("Marks for Java Programming is: " + javaMarks);
            System.out.println("Marks for Networking is: " + networkingMarks);
            System.out.println("Marks for Maths is: " + mathsMarks);
            System.out.println("The average is: " + String.format("%.2f", averageMarks));
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        enterMarksAndCalculateAverage();
    }
}
