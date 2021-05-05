package com.benkyou.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("a=" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
