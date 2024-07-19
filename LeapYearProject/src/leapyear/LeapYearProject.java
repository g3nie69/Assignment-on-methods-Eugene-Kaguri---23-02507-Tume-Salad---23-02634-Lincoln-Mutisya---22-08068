package leapyear;

import java.util.Scanner;

public class LeapYearProject {

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static void checkLeapYear() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            
            if (isLeapYear) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        checkLeapYear();
    }
}  
    
}
