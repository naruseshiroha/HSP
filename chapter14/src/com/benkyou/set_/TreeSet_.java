package com.benkyou.set_;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
//        Set<String> set = new TreeSet<>();
//        Set<String> set = new TreeSet<>(Comparator.comparingInt(String::length));
        Set<String> set = new TreeSet<>(String::compareTo);

        set.add("jack");
        set.add("tom");
        set.add("sp");
        set.add("a");
        set.add("abc"); // abc 加入不了
        System.out.println(set);

        /*
        1.构造器传入的比较器对象,付给了 TreeSet 的底层的 TreeMap 的 comparator 属性
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
        2.在调用 treeSet.add("tom"),底层会执行到
            do {
                parent = t;
                // 动态绑定匿名内部类(对象)/Lambda表达式
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else { // 如果相等,即返回 0,这个 Key 就没有加入
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
         */
    }
}
