package com.benkyou.set_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set<Car> set = new LinkedHashSet<>();
        set.add(new Car("奥拓",10000d));
        set.add(new Car("奥迪",300000d));
        set.add(new Car("法拉利",1000000d));
        set.add(new Car("奥迪",300000d));
        set.add(new Car("保时捷",3000000d));
        set.add(new Car("奥迪",300000d));
        System.out.println(set);
        System.out.println(set.size());

    }
}

class Car {
    private String name;
    private Double price;

    public Car() {
    }

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) && price.equals(car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
