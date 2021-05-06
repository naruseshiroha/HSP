package com.benkyou.homework;

public class Homework01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car c1 = new Car(100);
        System.out.println(car); // { price=9.0,color="red" }
        System.out.println(c1); // { price=100.0,color="red" }
    }
}

class Car {
    double price;
    static String color = "white";

    public Car() {
        price = 9;
        color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color=" + color +
                '}';
    }
}
