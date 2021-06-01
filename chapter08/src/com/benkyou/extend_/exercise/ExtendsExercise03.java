package com.benkyou.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
    }
}

class Computer {
    protected String CPU;
    protected int memory;
    protected int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public void getDetails() {
        System.out.println("Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                '}');
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

class PC extends Computer {
    private String brand;

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public void printInfo() {
        getDetails();
        System.out.println("brand is " + getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public void printInfo() {
        getDetails();
        System.out.println("color is " + getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}