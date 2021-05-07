package com.benkyou.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    //    public static void f2() throws ArithmeticException{
    public static void f2() {
        // 1.对于编译异常,程序中必须处理,比如 try-catch 或 throws
        // 2.对于运行时异常,程序中如果没有处理,默认就是 throws 的方式处理
        System.out.println(1 / 0);
    }

    public static void f1() throws FileNotFoundException {
        // 1.f3()抛出的是一个编译异常
        // 2.f1()必须处理这个编译异常
        // 3.要么 try-catch、throws
        f3();
    }

    public static void f3() throws FileNotFoundException {
        new FileInputStream("D:/a.png");
    }

    public static void f4() {
        // 1.f4()中调用方法f5()是OK的
        // 2.原因是f5()抛出的是运行异常
        // 3.java中有默认默认处理异常机制
        f5();
    }

    public static void f5() throws ArithmeticException {

    }

}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    // 3.子类重写父类方法时,对抛出异常的规定:子类重写的方法
    //   所抛出的异常类型要么和父类的异常一致,要么为父类抛出的异常类型的子类型
    // 4.在 throws 过程中,如果有方法 try-catch,就相当于处理异常,就可以不必 throws
    @Override
    public void method() throws RuntimeException {
    }
//    public void method() throws Exception{ } // overridden method does not throw 'java.lang.Exception'
}
