package trianglearea;

import java.util.Scanner;

public class Triangle {
    
    private double base;
    private double height;
    private double area;
    
     // Method to ask the user to enter the base and height of the triangle
    public void getDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    // Method to compute the area of the triangle
    public void computeArea() {
        area = 0.5 * base * height;
    }

    // Method to output the calculated area of the triangle
    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getDimensions();
        triangle.computeArea();
        triangle.displayArea();
    }
}
