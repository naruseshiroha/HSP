package com.benkyou.super_;

public class B extends A {
    public int n1 = 999;

    public void test() {
        // super 的访问不限于直接父类,如果爷爷类和本类中有同名的成员,也可以使用 super 去访问爷爷类的成员
        // 如果多个基类(上级类)中都有同名的成员,使用 super 访问遵循就近原则. A->B->C
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    public void hi() {
        // super.n4 不能访问 private 属性
        System.out.println(super.n1 + " " + this.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B cal().");
    }

    public void sum() {
        System.out.println("B sum().");
        // 找 cal() 方法时,顺序是
        // 1.先找本类,如果有,则调用
        // 2.如果没有,则找父类(如果有,并可以调用,则调用)
        // 3.如果父类没有,则继续找父类的父类,整个规则,就是一样的,直到 Object 类
        // 提示:如果查找过程中,找到了,但是不能访问,则报错, cannot access
        //     如果没有找到,则提示方法不存在
        // cal(); // -> this.cal()
        super.cal();
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // super.test400();
    }

    public B() {
        // super();
        super("jack", 10);
//        super("jack");
    }
}
