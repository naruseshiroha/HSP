package com.benkyou.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Homework01 {
    public static void main(String[] args) {
        News new1 = new News("新冠确证病例超千万,数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News new2 = new News("男子突然想起2个月前钓的鱼还在网兜里,捞起一看赶紧放生");
        ArrayList<News> list = new ArrayList<>();
        list.add(new1);
        list.add(new2);
        Collections.reverse(list);
        list.forEach(n -> System.out.println(n.getTitle().length() > 15 ? n.getTitle().substring(0, 15) + "..." : n.getTitle()));
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
