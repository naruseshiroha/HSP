package com.benkyou.set_;

import java.util.*;

public class HashSetExercise {
    public static void main(String[] args) {
        Employee zs = new Employee("zs", 19);
        Employee zs2 = new Employee("zs", 19);
        Employee ls = new Employee("ls", 20);
        List<Employee> employees = Arrays.asList(
                new Employee("zs", 19),
                new Employee("zs", 19),
                new Employee("ls", 20)
        );

        Set<Employee> set = new HashSet<>(employees);
        System.out.println(set);

    }
}

class Employee {
    private String name;
    private Integer age;

    public Employee() {
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}