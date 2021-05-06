package com.benkyou.wrapper_;

public class Integer01 {
    public static void main(String[] args) {
        // jdk5前是手动装箱和拆箱
        // 手动装箱 int->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        // 手动拆箱
        // Integer->int
        int i = integer.intValue();

        // jdk5后,就可以自动装箱和拆箱
        int n2 = 200;
        // 自动装箱
        Integer integer2 = n2; // 底层仍然使用 Integer.valueOf(n2);
        // 自动拆箱
        int n3 = integer2;// 底层仍然使用 integer2.intValue();

    }
}
