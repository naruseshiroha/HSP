package com.benkyou.enum_;

public class EnumDetail01 {
    public static void main(String[] args) {
        Music.CLASSIC_MUSIC.playing();
    }
}

class A {
}
// 1.使用 enum 关键字后,就不能再继承其他类了,因为 enum 会隐式继承 Enum,而 java 是单继承机制
//enum Size extends A {}

interface IPlay {
    void playing();
}

enum Music implements IPlay {
    CLASSIC_MUSIC;
    @Override
    public void playing() {
        System.out.println("好,好!!");
    }
}