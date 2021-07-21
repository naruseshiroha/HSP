package com.benkyou.homework;

import java.util.HashSet;
import java.util.Objects;

public class Homework06 {
    public static void main(String[] args) {
        HashSet<P> set = new HashSet<>();
        P aa = new P(1001, "AA");
        P bb = new P(1002, "BB");
        set.add(aa);
        set.add(bb);
        aa.name = "CC";
        set.remove(aa);
        System.out.println(set);
        set.add(new P(1001,"CC"));
        System.out.println(set);
        set.add(new P(1001,"AA"));
        System.out.println(set);
    }
}

class P {
    protected Integer id;
    protected String name;

    public P(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P p = (P) o;
        return id.equals(p.id) && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}