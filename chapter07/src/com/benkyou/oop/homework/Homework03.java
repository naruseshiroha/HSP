package com.benkyou.oop.homework;

public class Homework03 {
    public static void main(String[] args) {
        Book key = new Book("key", 170);
        Book seem = new Book("seem", 120);
        Book august = new Book("august", 99);
        key.updatePrice();
        System.out.println(key);
        seem.updatePrice();
        System.out.println(seem);
        august.updatePrice();
        System.out.println(august);
    }
}

class Book {
    private String name;
    private int price;

    public void updatePrice() {
        if (this.price > 150) {
            setPrice(150);
        } else if (this.price > 100) {
            setPrice(100);
        }
    }

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
