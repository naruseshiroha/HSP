package com.benkyou.final_;

public class Final01 {
}

// A 类不能被其他类继承, final 修饰
final class A {
}

//class B extends A {}

class C {
    // hi() 不能被子类重写
    public final void hi() {
    }

    // 属性值不能被修改
    public final static double TAX_RATE = 0.08;

    public void cry() {
        // 这是,NUM也称为局部常量
        final double NUM = 0.01;
//        NUM = 0.1;
        System.out.println("NUM=" + NUM);
    }
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("C hi().");
//    }
}