package com.benkyou.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("no1", "zyy");
        map.put("no2", "llh");
        map.put(new Car(), new Person());

        /*
        1.k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)
        2.k-v 为了方便程序员的遍历,还会创建 EntrySet 集合,该集合存放的元素的类型 Entry,一个 Entry 对象就有 k, v
              EntrySet<Entry<K,V>> 即 transient Set<Map.Entry<K, V>> entrySet;
        3.entrySet 中,定义的类形是 Map.Entry,但是实际上存放的还是 HashMap$Node
              因为 static class Node<K,V> implements Map.Entry<K,V> { }
        4.当把 HashMap$Node 对象存放到 entrySet 就方便我们的便利,因为 Map.Entry 提供了
              K getKey(); V getValue();
         */

        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        System.out.println(entries.getClass());
//        for (Map.Entry<Object, Object> entry : entries) {
        for (Object obj : entries) {
            Map.Entry<Object,Object> entry = (Map.Entry<Object,Object>) obj;
//            System.out.println(entry.getClass());
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set<Object> set = map.keySet();
        System.out.println(set.getClass());
        Collection<Object> values = map.values();
        System.out.println(values.getClass());
    }
}

class Car {

}

class  Person {

}