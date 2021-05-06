package com.benkyou.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        Season02 autumn = Season02.AUTUMN;
        // 输出枚举对象的名字
        System.out.println(autumn);
        // ordinary() 输出的是该枚举对象的次序/编号,从0开始
        System.out.println(autumn.ordinal());
        // 从反编译可以看出 values 方法,返回 Season02[]
        for (Season02 season:Season02.values()) {
            System.out.println(season);
        }
        // valueOf()
        // 执行流程
        // 1.根据输入的 "SUMMER" 到 Season02 的枚举对象去查找
        // 2.如果找到了,就返回;如果没有找到,就报错
        var summer = Season02.valueOf("SUMMER");
        System.out.println(summer.getName());
        // compareTo():比较两个枚举常量,比较的就是ordinary()编号
        /*  public final int compareTo(E o) {
                return self.ordinal - other.ordinal;
            }
         */
        System.out.println(summer.compareTo(autumn));

    }
}
