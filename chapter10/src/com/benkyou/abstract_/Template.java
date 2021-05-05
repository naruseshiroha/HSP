package com.benkyou.abstract_;

public abstract class Template {
    public abstract void job();

    public void calculateTime(){
        var start = System.currentTimeMillis();
        job();
        var end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
    }
}
