package com.benkyou.oop.homework;

public class Homework12 {
    public static void main(String[] args) {
    }
}

class Employee {
    private String name;
    private char gender;
    private int age;
    private String position;
    private int salary;

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String position, int salary) {
        this(name, gender, age);
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}