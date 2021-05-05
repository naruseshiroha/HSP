package com.benkyou.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好,李焕英");
        Movie movie2 = new Movie("名侦探柯南", 12);
        Movie movie3 = new Movie("秒速五厘米", 123, "新海诚");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影开始...");
    }

    /*
    (1) 三个构造器都有相同的语句
    (2) 这样代码看起来比较冗余
    (3) 这时我们可以把相同的语句,放入到一个代码块中,即可
    (4) 这样当我们不管调用哪个构造器,创建对象,都会先调用代码块的内容
    (5) 代码块调用的顺序优先于构造器
     */
    public Movie(String name) {
        System.out.println("Movie(String name)");
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price)");
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)");
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
