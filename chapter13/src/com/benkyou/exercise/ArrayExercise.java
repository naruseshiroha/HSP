package com.benkyou.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("新西游记", 9);
        books[2] = new Book("新三国演义", 50);
        books[3] = new Book("水浒", 20);
//        Arrays.sort(books,(Book a, Book b) -> (int)(a.getPrice() - b.getPrice()));
        Arrays.sort(books,(Book a, Book b) -> (int)(a.getName().length() - b.getName().length()));
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return (int) (o1.getPrice() - o2.getPrice());
//            }
//        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
