package com.benkyou.homework;

import java.util.*;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        Car[] cars = {new Car("BYD", 150000d), new Car("BWM", 300000d)};

        // add()
        list.add(new Car("TOYOTA", 230000d));
        // addAll
        list.addAll(Arrays.asList(cars));

        list.forEach(System.out::println);
        System.out.println("-----------");
        Iterator<Car> iterator = list.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
        System.out.println("-----------");

        // size()
        System.out.println(list.size());
        // isEmpty()
        System.out.println(list.isEmpty());
        // contains()
        System.out.println(list.contains(new Car("TOYOTA", 230000d)));
        // containsAll()
        System.out.println(list.containsAll(Arrays.asList(cars)));
        // remove()
        System.out.println(list.remove(1));
        System.out.println(list.remove(new Car("TOYOTA", 230000d)));
        // removeAll
        System.out.println(list.removeAll(Arrays.asList(cars)));
        list.add(new Car("NISSAN", 300000d));
        System.out.println(list);
        // clear
        list.clear();
        System.out.println(list);
    }
}

class Car {
    private String brand;
    private Double price;

    public Car(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return brand.equals(car.brand) && price.equals(car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}