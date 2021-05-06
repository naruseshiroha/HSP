package com.benkyou.exercise;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new ArrayIndexOutOfBoundsException("参数个数不对");
        }

        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            System.out.println(cal(n1,n2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数个数不对," + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确," + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("分母不能为0," + e.getMessage());
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}

class EcmDef {

}
