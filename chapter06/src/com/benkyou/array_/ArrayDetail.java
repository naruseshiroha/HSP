package com.benkyou.array_;

public class ArrayDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 2.数组是多个相同类型数据的组合,实现对这些数据的同一管理
//        int[] arr1 = {1,2,3,4,'h',"hi"}; // String -> int
        double[] arr = {'a', 1, .23, 1.1}; // int,char,float -> double

        // 2.数组中的元素可以是任何数据类型,包括基本类型和引用类型,但是不能混用
        String[] arr2 = {"tokyo", "BJ", "HK"};

        // 3.数组创建后,如果没有赋值,有默认值
        // byte 0, short 0, int 0, long 0, float 0.0, double 0.0
        // char \u0000, boolean false, String null
        short[] arr3 = new short[2]; // { 0,0 }
        for (short s : arr3) {
            System.out.println(s);
        }

        // 4.数组下标必须在指定范围内使用,否则报:ArrayIndexOutOfBoundsException
//        System.out.println(arr3[2]);

    }
}
