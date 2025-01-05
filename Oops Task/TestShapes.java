package com.mj.assignment;

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    public abstract void print();
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        System.out.println("Square: Side = " + side + ", Area = " + area() + ", Perimeter = " + perimeter());
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void print() {
        System.out.println("Triangle: Base = " + base + ", Height = " + height + ", Area = " + area() + ", Perimeter = " + perimeter());
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle: Radius = " + radius + ", Area = " + area() + ", Perimeter = " + perimeter());
    }
}

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape square = new Square(5);
	        Shape triangle = new Triangle(3, 4, 3, 4, 5);
	        Shape circle = new Circle(7);

	        square.print();
	        triangle.print();
	        circle.print();
	    }

}
