package com.benkyou.enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season_.AUTUMN);
    }
}

enum Season02 {

    // 使用 Enum 实现枚举类
    // 1.使用关键字 enum 代替 class
    // 2.public static final Season SPRING = new Season("春天","温暖");
    //   直接使用 SPRING("春天","温暖"); 代替 常量名(实参列表);
    // 3.如果有多个常量(对象),使用 ',' 隔开即可
    // 4.如果使用 enum 来实现枚举,要求将定义常量对象,写在前面
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");

    private String name;
    private String desc;

    Season02(String name, String desc) {
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
