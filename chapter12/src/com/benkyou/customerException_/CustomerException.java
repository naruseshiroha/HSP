package com.benkyou.customerException_;

public class CustomerException {
    public static void main(String[] args) {
        int age = 800;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120之间.");
        } else {
            System.out.println("age:" + age);
        }
    }
}

// 1.一般情况下,我们自定义异常是继承 RuntimeException
// 2.即把自定义异常做成运行时异常,好处是,可以使用java默认的处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
