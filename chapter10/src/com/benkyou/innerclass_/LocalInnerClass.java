package com.benkyou.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer02().m1();
    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() {
        System.out.println("outer02 m2().");
    }

    public void m1() {
        // 1.局部内部类是定义在外部类的局部位置,通常在方法体内
        // 3.不能添加访问修饰符,但是可以使用 final 修饰
        // 4.作用域:仅仅在定义它的方法或代码块中
        final class Inner02 { // 局部内部类(本质仍然是一个类)
            private int n1 = 233;
            // 2.可以直接访问外部类的所有成员,包含私有的
            public void f1() {
                // 5.局部内部类可以直接访问外部类的成员
                // 7.如果外部类和局部内部类的成员重名时,默认遵循就近原则,如果想要访问外部类的成员
                //   使用 外部类名.this.成员 去访问
                //   Outer02.this 本质就是外部类的对象,即那个对象调用了 m1(),Outer02.this 就是哪个对象
                System.out.println("n1 = " + n1);
                System.out.println("outer02.n1 = " + Outer02.this.n1);
                m2();
            }
        }
        // class Inner03 extends Inner02 {}

        // 6.外部类在方法中,可以创建Inner02对象,然后再调用方法即可
        new Inner02().f1();
    }

    {
        // class Inner03 {}
    }
}