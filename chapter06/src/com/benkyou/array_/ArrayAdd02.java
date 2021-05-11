package com.benkyou.array_;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 扩容数组
        int[] arr = {1, 2, 3};
        int[] brr;
        do {
            brr = new int[arr.length + 1];
            System.arraycopy(arr, 0, brr, 0, arr.length);
            System.out.print("请输入一个整数");
            int n = scanner.nextInt();
            brr[brr.length - 1] = n;
            arr = brr;
            System.out.print("是否继续添加?Y/N");
            char c = scanner.next().charAt(0);
            if (c == 'N') {
                break;
            } else if (c == 'Y') {
                System.out.println("继续添加");
            } else {
                System.out.println("输入应为Y/N");
                break;
            }
        } while (true);
        System.out.println(Arrays.toString(brr));
    }
}
