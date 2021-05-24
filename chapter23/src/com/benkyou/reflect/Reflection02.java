package com.benkyou.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试反射调用的性能,优化方案
 */
public class Reflection02 {
    public static void main(String[] args) throws Exception {
        // Field
        // Method
        // Constructor
        m1();
        m2();
        m3();
    }

    // 传统方法调用 hi
    public static void m1() {
        Cat cat = new Cat();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 9000_0000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("spend time " + (end - begin));
    }

    // 反射机制调用方法 hi
    public static void m2() throws Exception {
        Class cls = Class.forName("com.benkyou.reflect.Cat");
        Object o = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("hi");
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 9000_0000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("spend time " + (end - begin));
    }

    // 反射调用优化 + 关闭访问检查
    public static void m3() throws Exception {
        Class cls = Class.forName("com.benkyou.reflect.Cat");
        Object o = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("hi"); // 取消访问检查
        method.setAccessible(true);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 9000_0000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("spend time " + (end - begin));
    }

}
