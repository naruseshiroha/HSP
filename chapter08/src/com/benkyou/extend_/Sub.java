package com.benkyou.extend_;

public class Sub extends Base {
    public Sub() {
        // super();
        super("key", 11);
        System.out.println("Sub() is called.");
    }

    // 当创建子类对象时,不管使用子类的哪个构造器,默认情况下都会去调用父类的午参构造器
    public Sub(String name) {
        // super();
        super("seem", 12);
        System.out.println("Sub(String) is called.");
    }

    public Sub(String name, int age) {
        // super();
        // 调用 Base(String)
        // super("java");
        // 调用 Base(String, int)
        super("java", 8);

        // super() 在使用时,必须放在构造器的第一行
        // this() 在使用时,也必须放在构造器的第一行,因此两个不能共存在一个构造器中
        System.out.println("Sub(String, int) is called.");
    }

    public void sayOk() {
        // 非私有属性和方法可以在子类直接访问,但私有属性和方法不能直接在子类直接访问
        System.out.printf("n1:%d,n1:%d,n1:%d\n", n1, n2, n3);
        test100();
        test200();
        test300();
        // test400();
        // 需要通过父类提供的公共方法去访问私有属性
        System.out.println(getN4());
        callTest400();
    }
}
