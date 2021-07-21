package com.benkyou.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        // reverse(List): 反转 List 中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("----------");
        // shuffle(List): 对 List 集合元素进行随机排序
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println(list);
        }
        System.out.println("----------");
        // sort(List): 根据元素的自然顺序对指定 List 集合元素按照升序排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("----------");
        // sort(List, Comparator): 根据指定的 Comparator 产生的顺序 对 List 集合元素排序
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);
        System.out.println("----------");
        // swap(List, int, int): 将指定 List 集合中的 i 处元素 和 j 出元素进行交换
        Collections.swap(list, 1, 3);
        System.out.println(list);
        System.out.println("----------");
        // Object max(Collection): 根据元素的自然顺序,返回集合中的最大元素
        String max = Collections.max(list);
        System.out.println(max);
        System.out.println("----------");
        // Object max(Collection, Comparator): 根据 Comparator 指定的顺序,返回给定集合中的最大元素
        String max2 = Collections.max(list, Comparator.comparingInt(String::length));
        System.out.println(max2);
        System.out.println("----------");
        // Object min(Collection): 根据元素的自然顺序,返回集合中的最小元素
        String min = Collections.min(list);
        System.out.println(min);
        System.out.println("----------");
        // Object min(Collection, Comparator): 根据 Comparator 指定的顺序,返回给定集合中的最小元素
        String min2 = Collections.min(list, Comparator.comparingInt(String::length));
        System.out.println(min2);
        System.out.println("----------");
        // int frequency(Collection, Object): 返回指定集合中指定元素的出现次数
        int time = Collections.frequency(list, "tom");
        System.out.println(time);
        System.out.println("----------");
        // void copy(List dest, List src): 将 src 中的内容复制到 dest 中
        ArrayList<Object> dest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            dest.add(i);
        }
        Collections.copy(dest,list);
        System.out.println(dest);
        // boolean replaceAll(List list, Object oldVal, Object newVal):
        //      使用新值替换 List 对象的所有旧值
        boolean b = Collections.replaceAll(list, "tom", "zyy");
        System.out.println(b);
        System.out.println(list);
    }
}
