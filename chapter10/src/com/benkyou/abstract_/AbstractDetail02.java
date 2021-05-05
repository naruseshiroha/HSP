package com.benkyou.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("Hello D.");
    }
}

// 抽象方法不能使用 private final static 来修饰,因为这些关键字都是和重写相违背的
abstract class G {
    public abstract void hi();
//    private abstract void hi2();
//    private static void hi2();
//    private final void hi2();
}

// 如果一个类继承了抽象类,则必须实现抽象类的所有抽象方法,或者自己也声明为abstract类
abstract class F extends D {
}

class E extends D {

    @Override
    // 实现 -> 有方法体就行
    public void show() {
        System.out.println("D show() is called...");
    }
}

// 抽象类的本质还是类
abstract class D {
    public int n1 = 10;
    public static final double PI = 3.14;

    public void hi() {
    }

    public static void hello() {
    }

    public abstract void show();
}

