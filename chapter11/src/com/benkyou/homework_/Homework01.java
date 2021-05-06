package com.benkyou.homework_;

public class Homework01 {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            c.show();
        }
    }
}

interface IColor {
    void show();
}

enum Color implements IColor {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.printf("redValue:%d greenValue:%d blueValue:%d \n", redValue, greenValue, blueValue);
    }
}
