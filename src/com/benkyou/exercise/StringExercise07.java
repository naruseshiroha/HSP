package com.benkyou.exercise;

public class StringExercise07 {
    public static void main(String[] args) {
        // 字符串是不可变的,创建了两个对象
        // 编译器会优化,判断创建的常量对对象是否有引用指向
        // String str = "hello" + "World"; => str = "helloWorld";
        String str = "hello" + "World";
    }
}
