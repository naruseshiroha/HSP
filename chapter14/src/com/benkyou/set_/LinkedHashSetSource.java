package com.benkyou.set_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set<Object> set = new LinkedHashSet<>();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("zs",1));
        set.add(123);
        set.add("hsp");

        System.out.println(set);
        /*
        1.LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        2.LinkedHashSet 底层维护的时一个 LinkedHashMap（HashMap 的子类）
        3.LinkedHashSet 底层结构(数组 table + 双向链表)
        4.添加第一次时,直接将 数组 table 扩容到 16,存放的节点类型是 LinkedHashMap$Entry
        5.数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry
         */
        /*
        // 继承关系是在 内部类 完成的
        static class Entry<K,V> extends HashMap.Node<K,V> {
            LinkedHashMap.Entry<K,V> before, after;
            Entry(int hash, K key, V value, HashMap.Node<K,V> next) {
                super(hash, key, value, next);
            }
        }*/
    }
}

class Customer{
    private String name;
    private Integer no;

    public Customer(String name, Integer no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}