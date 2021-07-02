package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExercise02 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e2 = new Employee("tom", 100d, new MyDate(12, 11, 1980));
        Employee e1 = new Employee("jack", 100d, new MyDate(12, 12, 2001));
        Employee e3 = new Employee("tom", 100d, new MyDate(12, 10, 1980));
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employees.sort((a, b) -> {
            int i = a.getName().compareTo(b.getName());
            if (i != 0) {
                return i;
            }
            return a.getBirthday().compareTo(b.getBirthday());
        });

        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", salary='" + getSalary() + "'" + ", birthday='" + getBirthday()
                + "'" + "}";
    }

}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int yaer;

    public MyDate(int month, int day, int yaer) {
        this.month = month;
        this.day = day;
        this.yaer = yaer;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYaer() {
        return this.yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    @Override
    public String toString() {
        return "{" + " month='" + getMonth() + "'" + ", day='" + getDay() + "'" + ", yaer='" + getYaer() + "'" + "}";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = yaer - o.getYaer();
        if (yearMinus != 0) {
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        return day - o.getDay();
    }

}
