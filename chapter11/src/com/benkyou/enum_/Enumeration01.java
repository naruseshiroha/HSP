package com.benkyou.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season others = new Season("黄天", "其他");
    }
}

// 不能体现Season是固定的  =>  枚举类[枚:一个一个 举:例举,把具体的对象一个一个例举出来]
class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
