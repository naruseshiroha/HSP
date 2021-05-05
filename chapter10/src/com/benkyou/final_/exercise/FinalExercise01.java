package com.benkyou.final_.exercise;

public class FinalExercise01 {
    public static void main(String[] args) {
        double s1 = new Circle(2).calArea();
        System.out.println(s1);
    }
}

class Circle {
    private double radius;
    private final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea(){
        return PI * radius * radius;
    }
}
