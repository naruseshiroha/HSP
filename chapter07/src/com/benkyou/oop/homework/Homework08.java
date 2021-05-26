package com.benkyou.oop.homework;

public class Homework08 {
    public static void main(String[] args) {
        Test test = new Test();
        test.count1(); // 10
        Test test1 = new Test();
        test1.count2(); // 9
        test1.count2(); // 10
    }
}

class Test {
    int count = 9;

    public void count1() {
        count = 10;
        System.out.printf("count1=%d\n", count);
    }

    public void count2() {
        System.out.printf("count1=%d\n", count++);
    }
}