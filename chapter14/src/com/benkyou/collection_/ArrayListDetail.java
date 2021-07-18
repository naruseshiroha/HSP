package com.benkyou.collection_;

import java.util.ArrayList;

public class ArrayListDetail {
    public static void main(String[] args) {
        // ArrayList 是线程不安全的,没有 synchronized 修饰
        /*public boolean add(E e) {
            modCount++;
            add(e, elementData, size);
            return true;
        }        */
        ArrayList<Object> list = new ArrayList<>();
        list.add(null);
        list.add("jack");
        list.add(null);
        System.out.println(list);
    }
}
