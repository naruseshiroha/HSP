package com.benkyou.annotation_;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static java.lang.annotation.ElementType.*;

@SuppressWarnings({"all"}) // 作用范围:SuppressWarning内
public class SuppressWarning {
    public static void main(String[] args) {
        // 1.当我们不希望看到警告时,可以使用 @SuppressWarnings来抑制警告信息
        // 2.在{""}中写入你希望抑制(不显示)的警告信息
        // 3.可以指定警告的类型
        // 4.关于 @SuppressWarnings 作用范围是和放置的位置有关
        // 5.查看@SuppressWarnings的源码
        //   Target:位置  String[] value(): 设置一个数组,比如 {"rawtypes,unused,unchecked"}
        //    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
        //    @Retention(RetentionPolicy.SOURCE)
        //    public @interface SuppressWarnings {
        //        String[] value();
        //    }

        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("mary");
        int n;
        System.out.println(list.get(1));
    }
}
