package com.benkyou.oop.homework;

public class Homework06 {
    public static void main(String[] args) throws ArithmeticException {
        Cale cale = new Cale(10,2);
        System.out.println("add() " + cale.add());
        System.out.println("sub() " + cale.sub());
        System.out.println("mul() " + cale.mul());
        System.out.println("div() " + cale.div());
    }
}

class Cale {
    private double a;
    private double b;

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Cale() {
    }

    public double add() {
        return a + b;
    }

    public double sub() {
        return Math.abs(a - b);
    }

    public double mul() {
        return a * b;
    }

    public double div() throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("除数不能为0");
        return a / b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
