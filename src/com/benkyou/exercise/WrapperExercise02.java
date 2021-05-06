package com.benkyou.exercise;

import com.benkyou.wrapper_.Integer01;

public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false

        // -128-127 就是直接返回 否则 返回 new Integer()
        //    public static Integer valueOf(int i) {
        //        if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
        //            return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
        //        return new Integer(i);
        //    }
        Integer m = 1; // 自动装修 Integer.valueOf()
        Integer n = 1;
        System.out.println(m==n); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y); // false
    }
}
