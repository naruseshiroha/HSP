package com.benkyou.oop;

import java.util.Arrays;

public class MethodParameter02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -2, 0, -4};
        E e = new E();
        e.bubble(arr);
        System.out.println(Arrays.toString(arr)); // [-4, -2, 0, 1, 3, 5]
        Person03 p = new Person03(9, 100);
        // 调用方法 新开栈
        e.test200(p);
        System.out.println(p); // 1.{ age:11, salary:100 }  2. {9,100}
    }
}

class E {
    public void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    public void test200(Person03 p) {
//        p.setAge(11); // question 1
        p = new Person03(99,99); // question 2
//        p = null; // question 3
    }
}

class Person03 {
    private int age;
    private double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person03() {
    }

    public Person03(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person03{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}