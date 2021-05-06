package com.benkyou.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // void add(int index, Object obj):在 index 位置插入 ele 元素
        list.add("key");
        list.add("seem");
        list.add(0, 1);
        System.out.println("list=" + list);
        // boolean addAll(int index, Collection elements):从 index 位置插入 elements 中的所有元素
        ArrayList list2 = new ArrayList();
        list2.add('1');
        list2.add(2);
        list.addAll(1, list2);
        System.out.println("list=" + list);
        // Object get(int index):获取指定 index 位置的元素
        System.out.println(list.get(3));
        // int indexOf(Object obj):返回 obj 在集合中首次出现的位置
        int index = list.indexOf("1");
        System.out.println("'1' index is " + index);
        // int lastIndexOf(Object obj):返回 obj 在集合中最后一次出现的位置
        int lastIndex = list.lastIndexOf(1);
        System.out.println("1 last index is " + lastIndex);
        // Object remove(int index):移除指定 index 位置的元素,并返回此元素
        Object obj = list.remove(0);
        System.out.println("obj=" + obj);
        // Object set(int index, Object ele):设置指定 index 位置的元素为 ele,相当于替换
        list.set(1, '2');
        System.out.println("list=" + list);
        // List subList(int fromIndex, int toIndex):返回从 fromIndex 到 toIndex 位置的子集合 [2,3)
        List resultList = list.subList(2, 3);
        System.out.println("resultList=" + resultList);
    }
}
