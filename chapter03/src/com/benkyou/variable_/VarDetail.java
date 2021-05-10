package com.benkyou.variable_;

public class VarDetail {
    public static void main(String[] args) {
        // 变量必须先声明,后使用
        int n = 50;
        System.out.println(n);
        // 该区域的数据/值可以在同一类型内不断变化
        // n = 1.1;
        n = 1;
        System.out.println(n);

        // 变量在同一个作用域内不能重名
//        int n = 12;
    }
}

class Dog {
    public static void main(String[] args) {
        int n = 6;
    }
}
