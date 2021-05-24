package com.benkyou.reflect.class_;

import com.benkyou.reflect.Cat;

public class Class01    {
    public static void main(String[] args) throws Exception{
        // 看看 Class 类图
        // 1.Class 也是类,因此也继承 Object 类
        // Class
        // 2.Class 类对象不是 new 出来的,而是系统创建的
        // (1) 传统 new 对象
//        Cat cat = new Cat();
        // (2) 反射方式
        Class cls1 = Class.forName("com.benkyou.reflect.Cat");

        // 3.对于某个类的 Class 类对象,在内存中只有一份,因为类只加载一次
        Class cls2 = Class.forName("com.benkyou.reflect.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("com.benkyou.reflect.Dog");
        System.out.println(cls3.hashCode());

        // 4.每个类的实例都知道它是属于哪个 Class 对象实例所生成
        // 5.通过 Class 对象可以完整地得到一个类的完整结构,通过一系列API
        // 6.Class 对象是存放在堆的
        // 7.类的字节码二进制数据,是放在方法区的,有的地方称为类的元素据(包括 方法代码,变量名,方法名,访问权限等)
    }
}
