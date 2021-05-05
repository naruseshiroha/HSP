package com.benkyou.innerclass_;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.m1();
    }
}

class Outer05 {
    private int n1 = 10;
    private static String name = "LS";

    public static void cry() {
        System.out.println("cry()...");
    }

    // 静态内部类
    // 1.放在外部类的成员位置
    // 2.使用static修饰
    // 3.可以直接访问外部类的所有静态成员,包含私有的,但是不能访问非静态成员
    // 4.可以添加任意访问修饰符,因为它的地位就是一个成员
    // 5.作用域:同其他的成员,为整个类体
    public static class Inner05 {
        private static String name = "WB";

        public void say() {
            System.out.println("inner name=" + name + ", outer name=" + Outer05.name);
            cry();
        }
    }

    public void m1() {
        Inner05 inner05 = new Inner05();
        inner05.say();
    }
}
