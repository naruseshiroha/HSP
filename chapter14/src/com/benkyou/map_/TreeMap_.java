package com.benkyou.map_;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
//        Map<String,Object> treeMap = new TreeMap<>();
        Map<String,Object> treeMap = new TreeMap<>(Comparator.comparingInt(String::length).reversed());
        treeMap.put("hoop","杰克");
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","斯密斯");
        treeMap.put("kristina","克瑞斯提诺");
        System.out.println(treeMap);

        /*
        1.

        2.V put(K key, V value);
            public V put(K key, V value) {
                return put(key, value, true);
            }
            1).第一次添加,把 K-V 封装到 Entry对象,添加到 root
            Entry<K,V> t = root;
            if (t == null) {
                addEntryToEmptyMap(key, value);
                return null;
            }
            private void addEntryToEmptyMap(K key, V value) {
                compare(key, key); // type (and possibly null) check
                root = new Entry<>(key, value, null);
                size = 1;
                modCount++;
            }
            2).第二次添加
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {
                do { // 便利所有的 key
                    parent = t;
                    cmp = cpr.compare(key, t.key); // 动态绑定到匿名内部类/Lambda
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else { // 如果遍历过程中,发现准备添加 key 和 当前已有的 key 相同,则不添加
                        V oldValue = t.value;
                        if (replaceOld || oldValue == null) {
                            t.value = value;
                        }
                        return oldValue;
                    }
                } while (t != null);
            }
         */
    }
}
