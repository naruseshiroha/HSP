package com.benkyou.innerclass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.t1();

        // 外部其他类使用成员内部类的方式
        // 1.outer04.new Inner04(); 相当于把new Inner04()当作outer04的一个成员即可
        Outer04.Inner04 inner1 = outer04.new Inner04();
        inner1.say();
        // 2.在外部类红编写一个方法返回一个inner04对象实例
        Outer04.Inner04 inner2 = outer04.getInner04Instance();
        inner2.say();
    }
}

class Outer04 {
    private int n1 = 1;
    public String name = "zs";

    private void hi() {
        System.out.println("hi()");
    }

    // 1.成员内部类,是定义在外部类的成员位置上
    // 2.可以添加任意访问修饰符,因为它的地位就是一个成员
    public class Inner04 {
        public double salary = 999;
        private int n1 = 2;

        public void say() {
            // 3.可以直接访问外部类的所有成员,包括私有的
            // 如果成员内部类的成员和外部类的成员重名,默认遵循就近原则,
            // 访问外部类的成员可以通过 外部类名.this.成员名
            System.out.println("n1=" + n1 + " name=" + name + "外部类n1=" + Outer04.this.n1);
            hi();
        }
    }

    public void t1() {
        // 使用成员内部类
        // 创建成员内部类对象,然后调用相关方法
        Inner04 inner04 = new Inner04();
        inner04.say();
        System.out.println(inner04.salary);
    }

    public Inner04 getInner04Instance() {
        return new Inner04();
    }
}
