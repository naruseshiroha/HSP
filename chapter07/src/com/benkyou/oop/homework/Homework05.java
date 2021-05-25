package com.benkyou.oop.homework;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.printf("area=%.2f\n", area);
        System.out.printf("perimeter=%.2f\n", perimeter);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
