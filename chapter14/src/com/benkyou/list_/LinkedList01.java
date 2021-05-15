package com.benkyou.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表
        Node tom = new Node("TOM");
        Node jack = new Node("JACK");
        Node john = new Node("John");

        // 连接三个结点,形成双向链表
        tom.next = jack;
        jack.next = john;
        john.pre = jack;
        jack.pre = tom;

        Node first = tom; // 让 first 引用指向 tom,就是双向链表的头结点
        Node last = john; // 让 last 引用指向 john,就是双向链表的尾结点

        // 从头到尾遍历
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
        System.out.println("----------");
        // 从尾到头遍历
        while (last != null) {
            System.out.println(last);
            last = last.pre;
        }
        System.out.println("----------");

        Node smith = new Node("smith");
        // 演示链表的添加对象/数据,是多么的方便
        jack.next = smith;
        smith.pre = jack;
        smith.next = john;
        john.pre = smith;

        first = tom;
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
        System.out.println("----------");

        last = john;
        while (last != null) {
            System.out.println(last);
            last = last.pre;
        }

    }
}

// 定义一个 Node 类,Node 对象,表示双向链表的一个结点
class Node {
    public Object item; // 存放数据
    public Node next; // 指向下一个结点
    public Node pre; // 指向上一个结点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + item +
                '}';
    }
}
