package com.benkyou.set_;

import java.util.*;

public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet<Emp> set = new HashSet<>();

        MyDate d1 = new MyDate(2020, 11, 11);
        MyDate d2 = new MyDate(2020, 12, 11);
        MyDate d3 = new MyDate(2020, 11, 11);
        Emp zs1 = new Emp("zs", 1234d, d1);
        Emp zs2 = new Emp("zs", 4321d, d2);
        Emp zs3 = new Emp("zs", 2345d, d3);
        set.add(zs1);
        set.add(zs2);
        set.add(zs3);
        System.out.println(set);
    }
}

class Emp {
    private String name;
    private Double salary;
    private MyDate birthday;

    public Emp() {
    }

    public Emp(String name, Double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return name.equals(emp.name)  && birthday.equals(emp.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private Integer year;
    private Integer month;
    private Integer day;

    public MyDate() {
    }

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year.equals(myDate.year) && month.equals(myDate.month) && day.equals(myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}