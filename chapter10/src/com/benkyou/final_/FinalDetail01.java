package com.benkyou.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        new EE().cal();
    }
}

class AA {
    /**
     * 1.定义时
     * 2.构造器中
     * 3.代码块中
     */
    public final double TAX_RATE = 0.08;
    public final static double TAX_RATE2;
    public final double TAX_RATE3;
//    public final static double TAX_RATE3;

    public AA(){
//        TAX_RATE2 = 0.2; // Variable 'TAX_RATE2' might already have been assigned to
        TAX_RATE3 = 0.1;
    }

    static {
        TAX_RATE2 = 0.2;
    }

}

// final 类不能继承,但是可以实例化对象
final class  BB {

}

// 如果类不是final类,但是含有final方法,则该方法虽然不能重写,但是可以被继承,仍然遵守继承的机制
class DD {
    public final void cal(){
        System.out.println("cal() is called...");
    }
}

class EE extends DD {

}