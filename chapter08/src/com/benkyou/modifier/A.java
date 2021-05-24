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
}
