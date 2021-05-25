package com.benkyou.oop.scope;

public class VarScopeDetail {
    public static void main(String[] args) {
        Person person = new Person();
        /*
          全局变量(属性)生命周期较长,伴随着对象的创建而创建,伴随着对象的销毁而销毁
          局部变量生命周期较短,伴随着它的代码块的执行而创建,伴随着代码块的结束而销毁
         */
        person.say(); // 执行 say() 是,局部变量 name 会创建,执行完毕后 name 就会销毁,但是全局变量任然可以使用
        T t = new T();
        t.test(); // 第一种跨类访问对象属性的方式
        t.test(person); // 第二种跨类访问对象属性的方式
    }
}

class T {
    // 全局变量(属性):可以被本类使用,或其他类使用(通过 对象.属性)
    public void test() {
        Person person = new Person();
        System.out.println(person.getName());
    }

    public void test(Person p) {
        System.out.println(p.getAge());
    }
}

class Person {
    // 全局属性可以加修饰符(4种),局部变量不能加修饰符
    private String name = "Jack";
    private int age = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        // 局部属性可以和全局属性重名,访问时遵循就近原则
        // 如果要访问全局属性,可以通过 this.属性 访问
        String name = "Tom";
        System.out.println("name=" + name);
        System.out.println("this.name=" + this.name);
    }

    public void hi() {
        String address = "TOKYO";
        // Variable 'address' is already defined in the scope
        // String address = "PARIS";
        String name = "TOYOTA";

    }
}
