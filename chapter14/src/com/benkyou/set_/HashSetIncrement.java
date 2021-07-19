package com.benkyou.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSetIncrement {
    public static void main(String[] args) {
        /*
        HashSet 底层就是 HashMap,第一次添加时,table 数组扩容到 16,
        临界值(threshold)是 16 * 加载因子(loadFactor)是 0.75 = 12
        如果 table 数组使用到了临界值 12,就会扩容到 16 * 2 = 32,
        新的临界值就是 32 * 0.75 = 24. 依此类推
         */
        Set<Object> set = new HashSet<>();
//        for (int i = 0; i < 100; i++) {
//            set.add(i);
//        }
//        System.out.println(set);


        /*
        在 java8 中,如果一条链表的元素个数到达 TREEIFY_THRESHOLD(默认是 8),
        并且 table 的大小 >= MIN_TREEIFY_CAPACITY(默认 64),就会进行树化(红黑树),否则任然采用数组扩容机制
         */
        /*for (int i = 0; i < 12; i++) {
            set.add(new A(i));
        }
        System.out.println(set);*/

        // 当我们向 HashSet 增加一个元素时, -> Node -> 加入 table,就算是增加了一个
        for (int i = 0; i < 7; i++) { // 在 table的某一条链表上添加了 7 个 A 对象
            set.add(new A(i));
        }
        for (int i = 0; i < 7; i++) { // 在 table的另一条链表上添加了 7 个 B 对象
            set.add(new B(i));
        }
    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}
