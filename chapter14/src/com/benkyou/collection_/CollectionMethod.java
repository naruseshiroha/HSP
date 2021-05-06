package com.benkyou.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        // add:添加单个元素
        list.add("jack");
        list.add(1);
        list.add(true);
        System.out.println("list=" + list);
        // remove:删除指定元素
//        list.remove(1); // 删除第二个元素
//        list.remove(true); // 删除 true 元素
        System.out.println("list=" + list);
        // contains:查找元素是否存在
        var isExist = list.contains(1);
        System.out.println("1 is exist ? " + isExist);
        // size:获取元素个数
        var size = list.size();
        System.out.println("size=" + size);
        // isEmpty:判断是否为空
        var isEmpty = list.isEmpty();
        System.out.println("list is empty? " + isEmpty);
        // clear:清空
//        list.clear();
        System.out.println("list=" + list);
        // addAll:添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        list.addAll(arrayList);
        System.out.println("list=" + list);
        // containsAll:查找多个元素是否都存在
        arrayList.add(true);
        var isContainsAll = list.containsAll(arrayList);
        System.out.println(arrayList + " is contains all ?" + isContainsAll);
        // removeAll:删除多个元素
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        list.removeAll(arrayList2);
        System.out.println("list=" + list);
        // 说明:以ArrayList实现类来演示

    }
}
