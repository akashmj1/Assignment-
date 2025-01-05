package com.mj.assignment;

class Calculator {
    // Addition methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    // Subtraction methods
    public int diff(int a, int b) {
        return a - b;
    }

    public double diff(double a, double b) {
        return a - b;
    }

    public double diff(int a, double b) {
        return a - b;
    }

    public double diff(double a, int b) {
        return a - b;
    }

    // Multiplication methods
    public int mul(int a, int b) {
        return a * b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double mul(int a, double b) {
        return a * b;
    }

    public double mul(double a, int b) {
        return a * b;
    }

    // Division methods
    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public double div(int a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public double div(double a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();

        // Test addition methods
        System.out.println("Addition:");
        System.out.println("int + int: " + calculator.add(5, 3));
        System.out.println("double + double: " + calculator.add(5.5, 3.3));
        System.out.println("int + double: " + calculator.add(5, 3.3));
        System.out.println("double + int: " + calculator.add(5.5, 3));

        // Test subtraction methods
        System.out.println("\nSubtraction:");
        System.out.println("int + int: " + calculator.diff(5, 3));
        System.out.println("double + double: " + calculator.diff(5.5, 3.3));
        System.out.println("int + double: " + calculator.diff(5, 3.3));
        System.out.println("double + int: " + calculator.diff(5.5, 3));

        // Test multiplication methods
        System.out.println("\nMultiplication:");
        System.out.println("int + int: " + calculator.mul(5, 3));
        System.out.println("double + double: " + calculator.mul(5.5, 3.3));
        System.out.println("int + double: " + calculator.mul(5, 3.3));
        System.out.println("double + int: " + calculator.mul(5.5, 3));

        // Test division methods
        System.out.println("\nDivision:");
        System.out.println("int + int: " + calculator.div(6, 3));
        System.out.println("double + double: " + calculator.div(6.6, 3.3));
        System.out.println("int + double: " + calculator.div(6, 3.3));
        System.out.println("double + int: " + calculator.div(6.6, 3));

	}

}
