package com.benkyou.reflect.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        // 1.类
        Class<String> cls = String.class;
        // 2.接口
        Class<Serializable> cls2 = Serializable.class;
        // 3.数组
        Class<Integer[]> cls3 = Integer[].class;
        Class<float[][]> cls4 = float[][].class;
        // 4.注解
        Class<Deprecated> cls5 = Deprecated.class;
        // 5.枚举
        Class<Thread.State> cls6 = Thread.State.class;
        // 6.基本数据类型
        Class<Long> cls7 = long.class;
        // 7.void
        Class<Void> cls8 = void.class;
        // 8.Class
        Class<Class> cls9 = Class.class;
        System.out.println(cls);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);
        System.out.println(cls9);
    }
}
