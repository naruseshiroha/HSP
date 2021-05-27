package com.benkyou.extend_;

/*
 1.子类继承了所有的属性和方法,非私有属性和方法可以在子类直接访问,但是私有属性和方法不能直接在子类直接访问,要通过父类提供公共的方法去访问
 2.子类必须调用父类的构造器,完成父类的初始化
 3.当创建子类对象时,不管使用子类的哪个构造器,默认情况下总会去调用父类的无参构造器,如果父类没有提供午餐构造器,则必须在子类的构造器中用
   super 去指定使用父类的哪个构造器完成对父类的初始化工作,否则,编译不会通过
 4.如果希望指定去调用父类的某个构造器,则显示的调用一下: super(参数列表)
 5.super 在使用时,必须放在构造器第一行(super 只能在构造器中使用)
 6.super() 和 this() 都只能放在构造器第一行,因此这两个方法不能共存在一个构造器
 7.java 所有类都是 Object 类的子类,Object 是所有类的子类,Object 是所有类的基类
 8.父类构造器的调用不限于直接父类!将一直往上追溯到 Object 类
 9.子类最多只能继承一个父类(指直接继承),即 java 中是单继承机制
 10.不能滥用继承,子类和父类之间必须满足 is-a 的逻辑关系
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Sub jack = new Sub("jack");
        Sub tom = new Sub("tom", 10);
        sub.sayOk();
    }
}


