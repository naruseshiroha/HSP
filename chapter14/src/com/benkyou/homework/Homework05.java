package com.benkyou.homework;

import java.util.TreeSet;

public class Homework05 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        /*
         add(),因为 new TreeSet() 没有传入 Comparator 接口的匿名内部类
         所以在底层 Comparable<? super K> k = (Comparable<? super K><? super K>) key;
         即把 Person 转成 Comparable 类型 // ClassCastException
         */

        set.add(new Person());
    }
}

class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return o.hashCode();
    }
}