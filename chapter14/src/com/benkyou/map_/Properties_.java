package com.benkyou.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        /*
        1.Properties 继承 Hashtable
        2.可以通过 K-V 存放数据, K-V 不能为 null
         */
        Properties properties = new Properties();
        // put() 添加
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",80);
        // get() 获取对应值
        Object s = properties.get("lic");
        System.out.println(s);

        // remove() 删除
        properties.remove("john");
        System.out.println(properties);

        // put() key 存在,就是修改 value
        properties.put("lucy",200);
        System.out.println(properties);

        System.out.println(properties);
    }
}
