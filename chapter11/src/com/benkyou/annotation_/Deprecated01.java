package com.benkyou.annotation_;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

public class Deprecated01 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

// 1.@Deprecated 修饰某个元素,表示该元素已经过时
// 2.即不在推荐使用,但是仍然可以使用
// 3.查看 @Deprecated的源码
// 4.可以修饰方法、类、字段、包、参数等
// 5.@Deprecated的作用可以做到新旧版本的过渡
/*  @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
    public @interface Deprecated {
        String since() default "";
        boolean forRemoval() default false;
    }
*/

@Deprecated
class A {
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}
