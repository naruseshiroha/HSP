package com.benkyou.oop.exercise;

public class MethodExercise02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 5},
                {5, 6, 7},
        };
        MyTools myTools = new MyTools();
        myTools.print2DArr(arr);

        Person02 p = new Person02();
        p.name = "张三";
        p.age = 19;
        Person02 p2 = myTools.copyPerson(p);
        System.out.println(p + "\t" + p.hashCode());
        System.out.println(p2 + "\t" + p2.hashCode());

    }
}

class MyTools {
    public void print2DArr(int[][] arr) {
        for (int[] brr : arr) {
            for (int temp : brr) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public Person02 copyPerson(Person02 p) {
        Person02 newPerson = new Person02();
        newPerson.age = p.age;
        newPerson.name = p.name;
        return newPerson;
    }
}