package Assignments.Module_4;

import java.util.Scanner;

abstract class Shape {// Abstract class
    abstract double area(); // abstract method
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int radius = sc.nextInt();
        System.out.println("Enter the length of rectangle:");

        int length = sc.nextInt();
        System.out.println("Enter the width of rectangle:");

        int width = sc.nextInt();
        Shape c = new Circle(radius);
        Shape r = new Rectangle(length, width);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}
