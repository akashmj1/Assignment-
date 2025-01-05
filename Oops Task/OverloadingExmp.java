package com.mj.assignment;

class Shapes {
    // Method to calculate the area of a square
    public double area(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of a square
    public double perimeter(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double perimeter(double length, double width) {
        return 2 * (length + width);
    }
}
public class OverloadingExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes shape = new Shapes();

        // Calculate and print the area and perimeter of a square
        double squareSide = 5;
        System.out.println("Square Side: " + squareSide);
        System.out.println("Square Area: " + shape.area(squareSide));
        System.out.println("Square Perimeter: " + shape.perimeter(squareSide));

        // Calculate and print the area and perimeter of a rectangle
        double rectangleLength = 4;
        double rectangleWidth = 6;
        System.out.println("\nRectangle Length: " + rectangleLength + ", Width: " + rectangleWidth);
        System.out.println("Rectangle Area: " + shape.area(rectangleLength, rectangleWidth));
        System.out.println("Rectangle Perimeter: " + shape.perimeter(rectangleLength, rectangleWidth));

	}

}
