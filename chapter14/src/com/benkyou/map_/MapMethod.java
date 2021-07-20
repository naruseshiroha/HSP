package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        /*
        演示 Map 常用方法
        1).put() 添加
         */
        Map<Object, Object> map = new HashMap<>();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        System.out.println(map);

//        2).remove() 根据键删除映射关系
        map.remove(null);
        System.out.println(map);

//        3).get() 根据键获取值
        Object o = map.get("鹿晗");
        System.out.println(o);

//        4).size() 获取元素个数
        System.out.println(map.size());

//        5).isEmpty() 判断个数是否为0
        boolean flag = map.isEmpty();
        System.out.println(flag);

//        6).clear() 清除
        map.clear();
        System.out.println(map);

//        7).containsKey() 查找键是否存在
        System.out.println(map.containsKey("王宝强"));
    }
}

class Book {
    private String bookName;
    private double price;

    public Book() {
    }

    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
