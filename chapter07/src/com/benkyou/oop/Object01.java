package com.benkyou.oop;

public class Object01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "shiRo";
        cat.age = 10;
        cat.color = "white";
        System.out.println(cat);
        Cat cat2 = new Cat();
        cat2.name = "kuRo";
        cat2.age = 11;
        cat2.color = "black";
        System.out.println(cat2);
    }
}

class Cat {
    public String name;
    public int age;
    public String color;
//    private double weight;
    public String[] master; // 属性可以是基本数据类型,也可以是引用类型(对象,数组)

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
