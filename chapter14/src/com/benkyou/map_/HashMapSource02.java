package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapSource02 {
    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            map.put(new A(i),i);
        }

        map.put("aaa","bbb");
    }
}

class A {
    private Integer num;

    public A() {
    }

    public A(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num.equals(a.num);
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }
}