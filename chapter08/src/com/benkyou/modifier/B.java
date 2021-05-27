package com.benkyou.modifier;

public class B {
    public void say() {
        A a = new A();
        // 同一个包下,可以访问 public,protected,默认 修饰的属性 方法
        System.out.printf("n1:%d,n2:%d,n3:%d\n", a.n1, a.n2, a.n3);

        a.m1();
        a.m2();
        a.m3();
        // a.m4(); private void m4(){}
    }
}
