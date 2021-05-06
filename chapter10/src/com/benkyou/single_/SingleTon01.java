package com.benkyou.single_;

public class SingleTon01 {
    public static void main(String[] args) {

//        KaNoJyo sora = KaNoJyo.getSora();
//        System.out.println(sora);
        System.out.println(KaNoJyo.n1);

    }
}

class KaNoJyo{
    public static int n1 = 1;
    private String なまえ;

    // 为了能在静态方法中返回 KaNoJyo 对象,需要将其修饰为 static
    // 对象,通常是重量级的对象,饿汉式可能造成创建了对象,但是没有使用
    private static KaNoJyo sora = new KaNoJyo("そら");

    // 如何保证我们只能创建一个 KaNoJyo 对象
    // 单例模式-饿汉式
    // 1.将构造器私有化
    // 2.在类的内部直接创建对象(static)
    // 3.提供一个公共的 static 方法, 返回 KaNoJyo对象
    public KaNoJyo(String なまえ) {
        System.out.println("KaNoJyo() is called...");
        this.なまえ = なまえ;
    }

    public static KaNoJyo getSora(){
        return sora;
    }

    @Override
    public String toString() {
        return "KaNoJyo{" +
                "なまえ='" + なまえ + '\'' +
                '}';
    }
}
