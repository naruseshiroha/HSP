package com.benkyou.variable_;

public class FloatDetail {
    public static void main(String[] args) {
        // java 的浮点常量(具体值)默认为 double 型,声明 float 型,须后加 'f' 或 'F'
//        float f = 1.1;
        float f2 = 1.1F;
        double d = 1.1F;
        double d2 = 1.1;

        // 十进制数形式: 如: 5.12 51.20f .512
        double d3 = .125; // 0.125
        // 科学计数法形式: 如: 5.12e2 .125e-2
        double d4 = 5.12e2;
        double d5 = .125e-2;

        // 通常情况下,应该使用 double,因为它比 float 型更精确
        double x = Math.PI; // 3.141592653589793
        float y = (float) Math.PI; // 3.1415927
        System.out.println(x);
        System.out.println(y);

        // 浮点数使用陷阱 0.1 + 0.2 == 0.3
        double a = 0.1 + 0.2;
        double b = 0.3;
//        if (a == b) {
//            System.out.println("a = b");
//        } else {
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
//        }
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("a = b");
        }


    }
}
