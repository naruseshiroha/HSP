package com.benkyou.oop;

public class MethodDetail {
    public static void main(String[] args) {

    }
}

class A {

    // 访问修饰符(方法作用的范围)
    // public protected 默认 private
    public void f4() {
        // 方法不能嵌套定义
//        public void f5(){}
    }


    // 1.一个方法最多有一个返回值 [需要返回多个结果,返回数组]
    // 2.返回值可以为 基本类型 或 引用类型(数组,对象)
    public int[] getSumAndSub(int a, int b) {
        int[] resArr = new int[2];
        resArr[0] = a + b;
        resArr[1] = Math.abs(a - b);
        return resArr;
    }

    // 3.如果方法要求有返回数据类型,则方法体中最后的执行语句必须为 return 值
    //   而且要求返回值类型必须和 return 的值类型一致或兼容
    public double f1() {
        double d1 = 1.1 * 3;
        int n = 100;
        return n; // int -> double
    }

    // 4.如果方法是 void,则方法体中可以没有 return 语句,或者只写 return;
    // 在实际工作中,方法名要见名知意 遵循驼峰命名规则
    public void f3(String s, int n) {
        System.out.println("f3()...");
//        return;
    }
}
