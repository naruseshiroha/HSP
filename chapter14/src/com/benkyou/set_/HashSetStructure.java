package com.benkyou.set_;

import java.util.Arrays;

public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟 HashSet 底层

        // 1.创建一个数组,数组的类型是 Node[]
        //2.有些人,直接把 Node[] 称为 表
        Node[] table = new Node[16];

        // 3.创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack; // jack 挂载到 john
        Node rose = new Node("rose", null);
        jack.next = rose; // rose 挂载到 john

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        // 4.
        System.out.println(Arrays.toString(table));

    }
}

class Node {
    Object item; // 节点,存储数据,可以指向下一个节点,从而形成链表
    Node next; // 指向下一个节点

    public Node() {
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
