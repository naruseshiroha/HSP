package com.benkyou.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
    public static void main(String[] args) {
        String context = "abc$(a.bc(123_";
//        String regStr = "\\(";
        String regStr = "\\w";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(context);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
