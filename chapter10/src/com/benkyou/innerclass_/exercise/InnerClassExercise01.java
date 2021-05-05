package com.benkyou.innerclass_.exercise;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        // 当作实参直接传递
//        f1(new IL() {
//            @Override
//            public void show() {
//                System.out.println("这是一幅画.");
//            }
//        });
        f1(() -> System.out.println("这是一幅画"));
//        f1(new Picture());
    }

    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}

// 类->实现IL => 硬编码
class Picture implements IL {

    @Override
    public void show() {
        System.out.println("这也是一幅画..");
    }
}