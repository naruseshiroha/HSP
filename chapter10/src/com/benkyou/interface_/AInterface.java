package com.benkyou.interface_;

public interface AInterface {
    int n1 = 10;
    void hi();
    // 1.8以后,可以有默认实现方法,需要使用default关键字修饰
    default void hello(){
        System.out.println("hello");
    }
    // 1.8以后,可以有静态方法
    static void koNnNiChiHax(){
        System.out.println("こんにちは。");
    }
}
