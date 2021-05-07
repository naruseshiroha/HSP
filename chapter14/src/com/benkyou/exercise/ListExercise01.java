package com.benkyou.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(1, "key");
        Object five = list.get(4);
        System.out.println("fifth is " + five);
        list.remove(5);
        list.set(6, "seven");
        System.out.println();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }
    }
}
