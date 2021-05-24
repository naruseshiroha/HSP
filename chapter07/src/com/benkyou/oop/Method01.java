package com.benkyou.oop;

public class Method01 {
    public static void main(String[] args) {
        Person02 p = new Person02();
        p.speak();
        p.cal01();
        p.cal02(10);
        p.getSum(1,2);
    }
}

class Person02 {
    private String name;
    private int age;

    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void getSum(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
