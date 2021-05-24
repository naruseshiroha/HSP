package com.benkyou.reflect;

public class Car {
    public String brand = "BMW";
    private int price = 50_0000;
    public String color = "SHIRO";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
