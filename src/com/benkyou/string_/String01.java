package com.benkyou.string_;

public class String01 {
    public static void main(String[] args) {
        // 1.String 对象用于保存字符串,也就是一组字符串序列
        // 2."tom"字符串常量,双引号括起的字符序列
        // 3.字符串的字符串使用 Unicode 字符编码,一个字符(不分区字母和汉字)占两个字节
        // 4.String 类有很多构造器,构造器的重载
        //   public String()
        //   public String(String original)
        //   public String(char value[])
        //   public String(char value[], int offset, int count)
        //   public String(byte[] bytes)
        // 5.public final class String implements Serializable, Comparable<String> {
        //   Serializable[String 可串行化:即可以在网络传输]
        //   Comparable[String 对象可以比较大小]
        // 6.final 修饰,不能被其他类继承
        // 7.String 有属性 private final byte[] value; 用于存放字符串内容
        // 8.一定要注意:value 是一个 final 类型,不可以修改(!!!) 即value 不能指向新的地址,但是单个字符内容是可以变化

        String s = "1";
        s = "jack";

        final byte[] value = {'a','b','c'};
        System.out.println(new String(value));
        value[1] = 'c';
        System.out.println(new String(value));
        char[] v2 = {'t','o','m'};
//        value = v2; 不可以修改 value 地址
    }
}
