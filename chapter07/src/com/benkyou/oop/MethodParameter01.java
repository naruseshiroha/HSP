package com.benkyou.oop;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10; // 实参
        int b = 20;
        D d = new D();
        d.swap(a, b); // 10 20  ->  20 10

        System.out.printf("main, a = %d, b = %d", a, b); // 10 20

    }


}

class D {
    public void swap(int a, int b) {
        System.out.printf("a = %d \t b = %d \n", a, b);
        int temp = a;
        a = b;
        b = temp;
        // 基本数据类型,传递的是值(值拷贝),形参的任何改变不影响实参
        System.out.printf("a = %d \t b = %d \n", a, b);
    }
}