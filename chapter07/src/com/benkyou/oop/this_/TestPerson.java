package com.benkyou.oop.this_;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("mary", 20);
        Person p2 = new Person("mary", 20);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1 == p2);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        //    if (this.name.equals(p.name) && this.age == p.age) {
        //        return true;
        //    } else {
        //        return false;
        //    }
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}