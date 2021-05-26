package com.benkyou.oop.homework;

public class Homework09 {
    public static void main(String[] args) {
        Music key = new Music("key", 190);
        key.play();
        key.getInfo();
    }
}

class Music {
    private String name;
    private int times;

    public Music() {
    }

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.printf("%s is playing.\n", name);
    }

    public void getInfo() {
        System.out.printf("""
                name is %s,
                times is %d
                """, name, times);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }


}
