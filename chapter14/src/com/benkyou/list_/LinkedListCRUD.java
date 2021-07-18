package com.benkyou.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list=" + list);

        // 删除第一个结点
        list.remove();
        System.out.println("list=" + list);

        // 修改
        list.set(1, '9');
        System.out.println(list);

        // 索引从 0 开始
        Object o = list.get(1);
        System.out.println(o);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("------");
        for (Object o1 : list) {
            System.out.println(o1);
        }
    }
}
