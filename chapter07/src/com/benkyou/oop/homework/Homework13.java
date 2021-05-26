package com.benkyou.oop.homework;

public class Homework13 {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle01 c = new Circle01();
        passObject.printAreas(c, 5);
    }
}

class Circle01 {
    private double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public Circle01() {
    }

    public Circle01(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle01 circle, int times) {
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= times; i++) {
            circle.setRadius(i);
            System.out.printf("%.2f\t\t%s\n", (double) i, circle.findArea());
        }
    }
}