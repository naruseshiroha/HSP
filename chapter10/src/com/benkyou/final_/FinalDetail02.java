package com.benkyou.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.NUM);

//         包装类: String Integer Double 是 final 修饰的, 不可继承
    }
}

class BBB {
    public final static int NUM = 100;
    static {
        System.out.println("BBB static code is called...");
    }
}

// 如果一个类已经是final类,就没有必要再将方法修饰成final方法
final class AAA {
//    public final void cry(){
    public void cry(){
        System.out.println("cry() is called...");
    }
}
