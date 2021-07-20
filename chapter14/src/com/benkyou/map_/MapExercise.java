package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        Employee zyy = new Employee("zyy", 18000d, 1);
        Employee lx = new Employee("lx", 20000d, 2);
        Employee llh = new Employee("llh", 15000d, 3);
        map.put(zyy.getId(), zyy);
        map.put(lx.getId(), lx);
        map.put(llh.getId(), llh);
        System.out.println(map);

        map.entrySet().stream().filter(e -> e.getValue().getSalary() >= 18000).forEach(System.out::println);
        System.out.println("-------");
        map.values().stream().filter(e -> e.getSalary() >= 18000).forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private Double salary;
    private Integer id;

    public Employee() {
    }

    public Employee(String name, Double salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}