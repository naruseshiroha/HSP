package com.benkyou.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        // 无序(取出的顺序不会变),不重复
        Set<Object> set = new HashSet<>();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add("zyy");
        set.add("llh");
        set.add(null);
        set.add(null);

        set.forEach(System.out::println);

        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

        set.remove(null);

        System.out.println("-----");
        for (Object next : set) {
            System.out.print(next + " ");
        }
    }
}
