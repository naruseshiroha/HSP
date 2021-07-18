package com.benkyou.list_;

import java.util.Vector;

public class Vector_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 默认10个,2倍扩容
        /*public Vector() {
            this(10);
        } */
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);
    }
}
