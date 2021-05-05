package com.benkyou.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);

    }
}

interface IB {
    // 接口中的属性,只能是 final 的,而且是 public static final 修饰的
    int n1 = 10; // 等价于 public static final int n1 = 10;
    void hi();
}

// 接口不能继承其他类,但是可以继承多个接口
// 接口的修饰符只能是 public 或 默认的,这点和类的修饰符是一样的
interface ID extends IB,IC {
}

// 一个类可以同时实现多个接口
class Pig implements IB, IC {
    @Override
    public void hi() {

    }

    @Override
    public void hello() {

    }
}

interface IC {
    void hello();
}
