package com.benkyou.reflect.class_;

import com.benkyou.reflect.Car;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws Exception {
        /*
         1.
         2.
         */
        String classAllPath = "com.benkyou.reflect.Car";
        // 1.获取 Car 类对应的 Class 对象
        // <?> 表示不确定的 Java 类型
        Class<?> cls1 = Class.forName(classAllPath);
        // 2.输出 cls
        System.out.println(cls1); // 显示 cls 对象,是哪个类的 class 对象,com.benkyou.reflect.Car
        System.out.println(cls1.getClass()); // java.lang.Class
        // 3.得到包名
        System.out.println(cls1.getPackage().getName());
        // 4.得到全类名
        System.out.println(cls1.getName());
        // 5.通过 cls 创建对象实例
        Car car = (Car) cls1.getDeclaredConstructor().newInstance();
        System.out.println(car);
        // 6.通过反射获取属性 brand
        Field brand = cls1.getField("brand"); // 只能获取 public 属性
        System.out.println(brand.get(car));
        // 7.通过反射给属性赋值
        brand.set(car, "TOYOTA");
        System.out.println(brand.get(car));
        // 8.希望得到所有的属性
        for (Field f : cls1.getFields()) {
            System.out.println(f.getName());
        }
    }
}
