package com.benkyou.list_;

import java.util.ArrayList;

public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 1.List 集合类中元素有序(即添加顺序和取出顺序一致),且可重复
        ArrayList list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("smith");
        list.add("John");
        list.add("smith");
        System.out.println(list);
        // 2.List 集合中的每个元素都有其对应的顺序索引,即支持索引,从0开始
        System.out.println(list.get(3));
    }
}
