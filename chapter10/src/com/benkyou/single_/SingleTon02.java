package com.benkyou.single_;

/**
 * 懒汉式的单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
//        System.out.println(DaNnNa.n1);

        DaNnNa はるか = DaNnNa.getInstance();
        System.out.println(はるか);
        DaNnNa two = DaNnNa.getInstance();
        System.out.println(はるか == two);
    }
}

class DaNnNa {
    private String なまえ;
    public static int n1 = 1;
    public static DaNnNa だんな;

    // 1.步骤
    // 2.定义一个 static 静态属性对象
    // 3.提供一个 public 方法,可以返回一个DaNnNa对象
    // 4.懒汉式,只有当用户使用 getInstance(),才返回DaNnNa对象,后面再次调用时,会返回上次创建的DaNnNa对象,从而保证了单例
    private DaNnNa(String なまえ) {
        System.out.println("DaNnNa() is called...");
        this.なまえ = なまえ;
    }

    public static DaNnNa getInstance() {
        if (だんな == null) だんな = new DaNnNa("はるか");
        return だんな;
    }

    @Override
    public String toString() {
        return "DaNnNa{" +
                "なまえ='" + なまえ + '\'' +
                '}';
    }
}