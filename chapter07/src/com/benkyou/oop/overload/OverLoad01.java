package com.benkyou.oop.overload;

public class OverLoad01 {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
        System.out.println(calculate(1, 2.1));
        System.out.println(calculate(1.2, 2));
        System.out.println(calculate(1, 2, 3));

    }

    /*
      重载的好处
        1.减轻了起名的麻烦
        2.减轻了记名的麻烦
      方法名:必须相同
      形参列表:必须不同(形参类型或个数或顺序,至少有一样不同,参数名无要求)
      返回类型:无要求
    */
    //
    public static int calculate(int n1, int n2) {
        return n1 + n2;
    }

    public static double calculate(int n1, double n2) {
        return n1 + n2;
    }

    public static double calculate(double n1, int n2) {
        return n1 + n2;
    }

    public static double calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
