package com.benkyou.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ListExercise02 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book b1 = new Book("Seem社", "key", 1d);
        Book b2 = new Book("Alice社", "alice", 234d);
        Book b3 = new Book("August社", "key", 345d);
        Book b4 = new Book("Key社", "key", 123d);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.sort(Comparator.comparingDouble(Book::getPrice));
        System.out.println("list=" + list);

        List<Book> vector = new Vector<>();
        vector.add(b1);
        vector.add(b2);
        vector.add(b3);
        vector.add(b4);
        // 调用 reversed() 降序
        vector.sort(Comparator.comparingDouble(Book::getPrice).reversed());
        System.out.println("vector=" + vector);

        List<Book> linkedList = new LinkedList<>();
        linkedList.add(b1);
        linkedList.add(b2);
        linkedList.add(b3);
        linkedList.add(b4);
        // 作者为"key"的降序输出
        linkedList = linkedList.stream()
                .filter(t -> t.getAuthor() == "key")
                .sorted(Comparator.comparingDouble(Book::getPrice).reversed())
                .collect(Collectors.toList());
//        linkedList.sort((a, b) -> (int) (a.getPrice() - b.getPrice()));
        System.out.println("linkedList=" + linkedList);


    }

}

class Book {
    private String name;
    private String author;
    private Double price;

    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
