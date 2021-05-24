package com.benkyou.oop.recursion;

public class Recursion01 {
    public static void main(String[] args) {
        T t = new T();
        t.test(5); // 2 3 4 5

        int n = t.factorial(5); // 5! = 120
        System.out.println("5! is " + n);
    }
}

class T {
    public void test(int n) {
        if (n > 2) test(n - 1);
        System.out.println("n=" + n);
    }

    // 阶乘
    /*
     1.执行一个方法时,就创建一个新的受保护的独立空间(栈空间)
     2.方法的局部变量是独立的,不会相互影响,比如 n 变量
     3.如果方法中使用的是引用类型变量(比如数组,对象),就会共享该引用类型的数据
     4.递归必须向退出递归的条件逼近,否则就是无限递归,出现 StackOverflowError
     5.当一个方法执行完毕,或者遇到 return,就会返回,遵守谁调用,就将结果返回给谁,同时当方法执行完毕或者返回时,该方法也就执行完毕
     */
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}