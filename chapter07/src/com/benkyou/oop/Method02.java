package com.benkyou.oop;

public class Method02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},
        };

        MyTools myTools = new MyTools();
        myTools.printArr(arr);
    }
}

class MyTools {
    // 成员方法的好处:
    // 1.提高代码的复用性
    // 2.可以将实现的细节封装起来,然后供其他用户来调用即可
    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d]=%d ", i, j, arr[i][j]);
            }
            System.out.println();
        }
    }
}
