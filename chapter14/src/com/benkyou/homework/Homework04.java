package com.benkyou.homework;

import java.util.Comparator;
import java.util.TreeSet;

/*
HashSet 和 TreeSet 分别如何实现去重的
1).HashSet 的去重机制: HashCode() + equals(),底层先通过存入对象,进行运算得到一个 Hash 值,通过 Hash 值
   得到对应的索引,如果发现 table 索引所在的位置没有数据,就直接存放;如果有数据,就进行 equals 比较(遍历比较),
   如果比较后,不相同,就加入;相同,不加入.
2).TreeSet 的去重机制: 如果你传入了一个 Comparator 匿名对象,就使用实现的 compare 方法去重,如果方法返回 0,
   就认为是相同的元素/数据,就不添加;如果你没有传入一个 Comparator 匿名对象,则以添加的对象实现的 Comparable
   接口的 compareTp 去重.
 */
public class Homework04 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length));
        set.add("lx");
        set.add("smith");
        set.add("ll");
        System.out.println(set);
    }
}
