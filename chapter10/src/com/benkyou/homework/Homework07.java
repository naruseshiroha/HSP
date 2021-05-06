package com.benkyou.homework;

public class Homework07 {
    public static void main(String[] args) {
        new Car2(12.1).new Air().flow();
        new Car2(-5).new Air().flow();
        new Car2(41.1).new Air().flow();
    }
}

class Car2 {
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("大于26°,吹冷气...");
            } else if (temperature < 0) {
                System.out.println("小于0°,吹暖气...");
            } else {
                System.out.println("温度合适,关闭空调...");
            }
        }
    }
}


