package com.benkyou.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season_.AUTUMN);
    }
}

class Season_ {
    private String name;
    private String desc;

    public static final Season_ SPRING = new Season_("春天", "温暖");
    public static final Season_ SUMMER = new Season_("夏天", "炎热");
    public static final Season_ AUTUMN = new Season_("秋天", "凉爽");
    public static final Season_ WINTER = new Season_("冬天", "寒冷");

    // 1.将构造器私有化,目的,防止直接 new
    // 2.去掉 setter方法,防止属性被修改
    // 3.在 Season_内部,直接创建固定的对象
    // 4.优化,可以加入 final修饰符,避免加载 Season_类
    private Season_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season_{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

