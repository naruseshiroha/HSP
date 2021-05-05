package com.benkyou.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

//        new IA();


    }
}

// 1.接口不能被实例化
// 2.接口中所有的方法都是 public 的,接口中抽象方法可以不用 abstract 修饰
// 3.一个普通类实现接口,就必须将发i接口的所有方法实现
interface IA {
    void say();

    void hi();
}

class cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {
}
