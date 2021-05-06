package com.benkyou.annotation_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Override01 {
}

class Father {
    public void fly() {
        System.out.println("Father fly()");
    }
}

class Son extends Father {
    // 1.@Override注解放在 fly()上,表示子类的 fly()重写了父类的 fly()
    // 2.这里如果没有写 @Override还是重写了父类的 fly()
    // 3.如果你写了@Override,编译器就回去检查该方法是否真的重写了父类的方法,
    //   如果的确重写了,则编译通过;如果没有构成重写,则编译错误
    // 4.@Override的定义 @interface 表示一个 注解类
    //   @Target(ElementType.METHOD)
    //   @Retention(RetentionPolicy.SOURCE)
    //   public @interface Override {
    //   }
    @Override
    public void fly() {
        System.out.println("Son fly()");
    }

//    @Override
    public void say(){}
}