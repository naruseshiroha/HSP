package com.benkyou.list_;

import java.util.LinkedList;

public class LinkedListCRUD {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list=" + list);
        list.remove(); // 删除第一个结点
        System.out.println("list=" + list);
        list.set(1,'9');
    }
}
