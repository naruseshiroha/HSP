package com.benkyou.encap;

public class Encapsulation01 {
    public static void main(String[] args) {

    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // getter,setter 就是封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("长度应该在2-6位");
            this.name = "null";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("age 必须在 1-20 之间.");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}