package com.benkyou.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    public static void main(String[] args) {
        String context = "a11 c 8ab \n c_-ABC";
//        String regStr = "[a-z]";
//        String regStr = "[A-Z]";
//        String regStr = "(?i)abc";
//        String regStr = "[0-9]";
//        String regStr = "[^a-z]";
//        String regStr = "[abcd]";
//        String regStr = "\\d"; // "[0-9]"
//        String regStr = "\\D"; // "[^0-9]"
//        String regStr = "\\w"; // "[a-zA-Z0-9_]"
//        String regStr = "\\W"; // "[^a-zA-Z0-9_]"
//        String regStr = "\\s"; // 空格
//        String regStr = "\\S"; // 非空格
        String regStr = "."; // 除 \n, 如果需要匹配 . 需要 \\.
        Pattern pattern = Pattern.compile(regStr);
        // Pattern.CASE_INSENSITIVE 表示不区分大小写
//        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(context);
        int i = 0;
        while (matcher.find()) {
            System.out.println(++i + ": " + matcher.group(0) + ".");
        }
    }
}
