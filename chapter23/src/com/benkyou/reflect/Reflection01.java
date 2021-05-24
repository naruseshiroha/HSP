package com.benkyou.reflect;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        // 1.使用 Properties 类,可以读写配置文件
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/re.properties");
        properties.load(fis);
        String classFullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classFullPath=" + classFullPath);
        System.out.println("methodName=" + methodName);
        // 2.创建对象,传统的方法,行不通 => 反射机制
//        new classFullPath();
        // 3.使用反射机制解决
        // (1) 加载类,返回 Class 类型的对象 cls
        Class cls = Class.forName(classFullPath);
        // (2) 通过 cls 得到你加载的类 com.benkou.reflect.Cat 的对象实例
        Object o = cls.getDeclaredConstructor().newInstance();
        System.out.println("o running type is " + o.getClass());
        // (3) 通过 cls 得到你加载的类 com.benkyou.reflect.Cat 的 methodName"hi" 的方法对象
        //     即:在反射中,可以把方法视为对象(万物皆对象)
        Method method = cls.getMethod(methodName);
        // (4) 通过 method 调用方法:即通过方法来实现调用方法
        method.invoke(o); // 传统 对象.方法(); 反射机制 方法.invoke(对象)

        // java.lang.reflect.Field: 代表类的成员变量,Field 对象表示某个类的成员变量
        // 得到 name 字段
        // getField 不能得到私有的属性
        Field ageField = cls.getField("age");
        // 传统写法:对象.成员变量  反射:成员变量对象.get(对象)
        System.out.println(ageField.get(o));

        // java.lang.reflect.Construct: 代表类的构造方法,Constructor 对象表示构造器
        Constructor constructor = cls.getConstructor(); // ()中可以指定构造器参数类型,返回无参构造器
        System.out.println(constructor);
        Constructor constructor2 = cls.getConstructor(String.class); // 这里老师传入 String.class 就是 String 类的 Class 对象
        System.out.println(constructor2);
        Constructor constructor3 = cls.getConstructor(String.class, Integer.class); // 这里老师传入 String.class 就是 String 类的 Class 对象
        System.out.println(constructor3);
    }
}
