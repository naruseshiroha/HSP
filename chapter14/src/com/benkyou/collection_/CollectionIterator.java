package com.benkyou.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("key社", "key", 123));
        collection.add(new Book("seem社", "seem", 234));
        collection.add(new Book("august社", "august", 345));

        // 1.得到 iterator
        Iterator iterator = collection.iterator();
        // 2.while 循环遍历
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        // 3.退出 while 循环后,这时 iterator 迭代器,指向最后的元素
        // 4.如果希望再次遍历,需要重置我们的迭代器
        iterator = collection.iterator();
        iterator.next(); // NoSuchElementException
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }


    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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
