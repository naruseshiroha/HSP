package com.benkyou.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        // 类被加载的情况
        // 1.创建对象实例时
//        A a = new A();
        // 2.创建子类对象实例,父类也会被加载,而且,父类先被加载,子类后被加载
        B b = new B();
        // 3.使用类的静态成员时(静态属性,静态方法)
        int n = Cat.n1;

        // static block 是在类加载时执行的,而且只执行一次


        // 普通代码块,在创建对象实例时,会被隐式的调用
        // 被创建一次,就会调用一次
        // 如果只是使用类的静态成员时,普通代码块并不会执行
        System.out.println(D.n1);


    }
}

class D {
    public static int n1 = 888;

    static {
        System.out.println("D static code block ...");
    }

    {
        System.out.println("D code block ...");
    }
}

class Animal {
    static {
        System.out.println("animal static code block ...");
    }
}

class Cat extends Animal {
    public static int n1 = 999;

    static {
        System.out.println("c static code block ...");
    }
}

class A {
    static {
        System.out.println("A static code block ...");
    }
}

class B extends A {
    static {
        System.out.println("B static block ...");
    }
}
