package com.benkyou.try_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        // 1.如果 try 代码块可能有多个异常
        // 2.可以使用多个 catch 分别捕获,对应处理
        // 3.要求子类异常写在前面,父类异常写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int res = 1 / 0;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally code block");
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}