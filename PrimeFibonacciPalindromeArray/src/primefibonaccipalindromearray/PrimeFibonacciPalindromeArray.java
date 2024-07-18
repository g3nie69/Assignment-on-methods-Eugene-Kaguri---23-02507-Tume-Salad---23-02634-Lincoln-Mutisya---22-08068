package primefibonaccipalindromearray;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PrimeFibonacciPalindromeArray {

    // Constructor
    public PrimeFibonacciPalindromeArray() {
        // Constructor logic if needed
    }

    public static void main(String[] args) {
        PrimeFibonacciPalindromeArray program = new PrimeFibonacciPalindromeArray();

        // Part 1(a): Display prime numbers between 1 to 500
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (program.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Part 1(c): Sum of even Fibonacci numbers not exceeding four million
        int sumEvenFibonacci = sumEvenFibonacci(4000000);
        System.out.println("Sum of even Fibonacci numbers up to 4,000,000: " + sumEvenFibonacci);

        // Part 2: Palindrome Checker with GUI
        createPalindromeGUI();

        // Part 3: Array Operations
        arrayOperations();
    }

    // Non-static method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to find the sum of even-valued Fibonacci numbers up to a limit
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1;
        int b = 2;
        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return sum;
    }

    // Static method to create a GUI for palindrome checking
    public static void createPalindromeGUI() {
        JFrame frame = new JFrame("Palindrome Checker");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Check");
        JLabel resultLabel = new JLabel();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText(input + " is a palindrome.");
                } else {
                    resultLabel.setText(input + " is not a palindrome.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number:"));
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Static method to check if a string is a palindrome
    public static boolean isPalindrome(String number) {
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Static method to perform array operations
    public static void arrayOperations() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Values in the array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        int[] reversedArray = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        System.out.println("Reversed array:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        int sum = 0;
        int product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}