package com.benkyou.modifier;

public class A {
    /*
      访问级别    访问控制修饰符    同类    同包    子类    不同包
      公开        public         √       √      √      √
      受保护      protected      √       √      √      √
      默认        没有修饰符      √       √      √      √
      私有        private       √       √      √      √
     */
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        // 同一个类中,可以访问 public protected 默认 private 修饰的属性
        System.out.printf("n1:%d,n2:%d,n3:%d,n4:%d\n", n1, n2, n3, n4);
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }

    public void hi() {
        // 同一个类中,可以访问 public protected 默认 private 修饰的方法
        m1();
        m2();
        m3();
        m4();
    }
}
