package com.benkyou.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("key社", "key", 123));
        collection.add(new Book("seem社", "seem", 234));
        collection.add(new Book("august社", "august", 345));

        // 1.使用增强 for,遍历 collection 集合,也可以遍历数组
        // 2.底层仍然是 iterator
        // 3.可以理解成就是简化版本的 迭代器遍历
        for (Object book : collection) {
            System.out.println(book);
        }
    }
}
