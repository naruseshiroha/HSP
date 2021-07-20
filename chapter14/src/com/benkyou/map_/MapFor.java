package com.benkyou.map_;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        /*
        Map 遍历方式
        1).containsKey() 查找键是否存在
        2).keySet() 获取所有键
        3).EntrySet() 获取所有关系 K-V
        4).values() 获取所有的值
         */
        Map<Object, Object> map = new HashMap<>();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        // 1.先取出所有的 key,通过 key 取出对应的 value
        // 1).增强 for
        Set<Object> set = map.keySet();
        for (Object key : set) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("-------------");
        // 2).迭代器
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 2.把所有的 values 取出
        Collection<Object> values = map.values();
        // 1).增强 for
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("-------------");
        // 2).迭代器
        Iterator<Object> iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        System.out.println("-------------");
        // 3.通过 EntrySet 来获取 K-V
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        // 1).增强 for
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("-------------");
        // 2).迭代器
        Iterator<Map.Entry<Object, Object>> iterator3 = entries.iterator();
        while (iterator3.hasNext()) {
            Map.Entry<Object, Object> entry = iterator3.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}
