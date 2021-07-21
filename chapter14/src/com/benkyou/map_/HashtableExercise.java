package com.benkyou.map_;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExercise {
    public static void main(String[] args) {
        /*
        1.存放的元素是键值对: 即 K-V
        2.Hashtable 的键和值都不能为 null,否则会抛出 NullPointException
        3.Hashtable 使用方法基本上和 HashMap 一样
        4.Hashtable 是线程安全的(synchronized),HashMap 是线程不安全的
         */
        Map<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("john",100);
//        hashtable.put(null,100);
//        hashtable.put("john",null);
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",88);
        for (int i = 1; i < 7; i++) {
            hashtable.put(i,i);
        }
        System.out.println(hashtable);
        /*
        1.底层有一个 Hashtable$Entry[] 数组,初始大小为 11
        2.threshold 8 = 11 * 0.75
        3.扩容: 按照自己的扩容机制进行
        4.addEntry(hash, key, value, index) 添加 K-V 封装 Entry
        5.if (count >= threshold) { rehash() } 满足时就,进行扩容
            int newCapacity = (oldCapacity << 1) + 1;
            Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];
         */
    }
}
