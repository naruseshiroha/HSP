package com.benkyou.pkg;

import java.util.Arrays;

// 我们需要使用到哪个类，就导入哪个类即可，不建议使用 *导入
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
