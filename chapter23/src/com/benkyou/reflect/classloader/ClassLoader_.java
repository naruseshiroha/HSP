package com.benkyou.reflect.classloader;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoader_ {
    /*
     类加载时机
       1.当创建对象时(new) // 静态加载
       2.当子类被加载时,父类也加载 // 静态加载
       2.通过类中的静态成员比时 // 静态加载
       2.通过反射 // 动态加载
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        switch (key) {
            case "1" -> {
                // 静态加载:编译时加载相关的类,如果没有报错,依赖性强
                Fish fish = new Fish(); // 静态加载,依赖性强
                fish.eat();
            }
            case "2" -> {
                // 反射 -> 动态加载
                // 动态加载:运行时加载需要的类,如果运行时不用该类,即使不存在该类,也不报错,降低了依赖性
                Class cls = Class.forName("com.benkyou.reflect.classloader.Person");
                Object o = cls.getDeclaredConstructor().newInstance();
                Method m = cls.getMethod("hi");
                m.invoke(o);
                System.out.println("OK");

            }
            default -> System.out.println("do nothing.");
        }
    }
}

class Fish {
    public void eat() {
        System.out.println("eat()...");
    }
}

class Person {
    public void hi(){
        System.out.println("hi()...");
    }
}