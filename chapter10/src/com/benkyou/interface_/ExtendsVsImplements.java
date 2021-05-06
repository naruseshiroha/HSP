package com.benkyou.interface_;

public class ExtendsVsImplements {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("WuKong");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}

/**
 * 小结: 当子类继承了父类,就自动的拥有父类的功能
 *      如果子类需要扩展功能,可以通过实现接口的方式扩展
 *      可以理解 实现接口 是对 java 单继承机制的一种补充
 */

interface IFish {
    void swimming();
}

interface IBird {
    void flying();
}

class Monkey {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " is climbing.");
    }
}

class LittleMonkey extends Monkey implements IFish,IBird {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习,可以像鱼儿一样游泳.");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习,可以像鸟儿一样飞翔.");
    }
}