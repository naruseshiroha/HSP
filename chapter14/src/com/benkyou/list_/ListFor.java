package com.benkyou.list_;

import java.util.ArrayList;
import java.util.Iterator;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 常见 List 实现类, ArrayList Vector LinkedList
        ArrayList list = new ArrayList();
        list.add("key");
        list.add("seem");
        list.add("august");

        // 1.iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.print(o + " ");
        }
        System.out.println();
        // 2.for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // 3.forEach
        for (Object o : list) {
            System.out.print(o + " ");
        }

    }
}
