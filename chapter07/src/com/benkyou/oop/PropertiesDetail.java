package com.benkyou.oop;

public class PropertiesDetail {
    public static void main(String[] args) {
        // p1 对象名(对象引用)
        // new Person() 创建的对象空间(数据)才是真正的对象
        Person person = new Person();

        // 对象的属性默认值,遵守数组规则
        System.out.println(person);
    }
}

class Person {
    private int age;
    private String name;
    private double salary;
    private boolean isPass;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isPass=" + isPass +
                '}';
    }
}