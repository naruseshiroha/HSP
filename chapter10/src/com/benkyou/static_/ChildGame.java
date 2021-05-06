package com.benkyou.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child bgj = new Child("bgj");
        bgj.join();
//        count++;
        bgj.count++;
        Child hlj = new Child("hlj");
        hlj.join();
//        count++;
        hlj.count++;
        Child lsj = new Child("lsj");
        lsj.join();
//        count++;
        lsj.count++;
        System.out.println("total= " + count);
    }
}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " join game.");
    }
}
