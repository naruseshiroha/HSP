package com.benkyou.reflect.question;

import com.benkyou.reflect.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectQuestion {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        // 根据 rs.properties,创建 Cat 对象并调用 hi()
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
    }
}
