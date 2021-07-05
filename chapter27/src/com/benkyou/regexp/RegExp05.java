package com.benkyou.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    public static void main(String[] args) {
        String context = "リジュン　りじゅん　李洵 liXun ";
        String regStr = "リジュン|りじゅん|(?i)lixun|李洵";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(context);
        int i = 0;
        while (matcher.find()) {
            System.out.println(++i + ": " + matcher.group(0) + ".");
        }
    }
}
