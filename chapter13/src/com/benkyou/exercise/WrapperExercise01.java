package com.benkyou.exercise;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;
        Float f = 1.5f;

        // 三元运算符是一个整体 精度最高是double 输出1.0
        Object obj1 = true ? new Integer(1):new Double(2.0);
        System.out.println(obj1);
        Object  obj2 ;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
