package com.benkyou.reflect.class_;

import com.benkyou.reflect.Car;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.Class.forName();
        String classAllPath = "com.benkyou.reflect.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls + ":" + cls.hashCode());

        // 2.类.class,应用场景:用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2 + ":" + cls.hashCode());

        // 3.对象.getClass(),应用场景,有对象实例
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3 + ":" + cls.hashCode());

        // 4.通过类加载器[4种]来获取到类的 Class 对象
        //   (1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //   (2)通过类加载器得到 Class 对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4 + ":" + cls.hashCode());

        // cls1,cls2,cls3,cls4 是同一个对象

        // 5.基本数据类型(byte,short,int,long,float,double,char,boolean) 按如下方式得到 Class 类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass + ":" + integerClass.hashCode());

        // 6.基本数据类对应的包装类,可以通过 .TYPE 得到 Class 类对象
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type + ":" + type.hashCode());
        System.out.println(type1);

    }
}
