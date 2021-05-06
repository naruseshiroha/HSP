package com.benkyou.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer03().method();
    }
}

class Outer03 {
    private int n1 = 10;

    public void method() {
        // 基于接口的匿名内部类
        // 1.需求: 想使用IAA接口,并创建对象
        // 2.传统方式,写一个类,实现该接口,并创建对象
        // 3.需求是只需要使用一次,后面不再使用
        // 4.可以使用匿名内部类来简化开发
        // 5.tiger的编译类型 ? IAA
        // 6.tiger的运行类型 ? 就是匿名内部类 XXXX = Outer03$1
        /*
         * 我们看底层 class Outer03$1 implements IAA {
         *
         * @Override public void cry() { System.out.println("tiger is crying."); } }
         */
        // 7.jdk底层在创建匿名内部类 Outer03$1,立即就创建了 Outer03$1 实例,
        //   并且把地址返回给 tiger
        // 8.匿名内部类使用一次,就不能再使用
//        IAA tiger = new IAA() {
//            @Override
//            public void cry() {
//                System.out.println("tiger is crying.");
//            }
//        };
        IAA tiger = () -> System.out.println("tiger is crying.");
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
    }
}

interface IAA {
    void cry();
}

class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void test() {

    }
}