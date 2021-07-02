package customgeneric;

import java.util.ArrayList;

@SuppressWarnings({ "all" })
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        // 当调用方法时,传入参数,编译器就会确定类型
        // car.fly("BWM", 100);
        // car.fly(.1, 100);

        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), "hello");

    }
}

// 泛型方法,可以定义在普通类中,也可以定义在泛型类中
class Car {
    // 普通方法
    public void run() {
    }

    // 泛型方法, <T, R> 就是泛型, 提供给 fly 参数使用
    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        // 100 -> Integer 自动装箱
        System.out.println(r.getClass());
    }
}

// 泛型类
class Fish<T, R> {
    public void run() {
    }

    // 泛型方法
    public <U, M> void eat(U u, M m) {
    }

    // hi() 不是泛型方法,而是 hi() 使用了类声明的 泛型
    public void hi(T t) {

    }

    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}