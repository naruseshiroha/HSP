package com.benkyou.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
        /*
          AA
          HaHaHa BB(String name)
          CC(String name)
         */
    }
}

class AA {
    public AA(){
        System.out.println("AA()");
    }
}

class BB extends  AA {
    public BB(){
        System.out.println("BB()");
    }

    public BB(String name) {
        System.out.println(name + " BB(String name)");
    }
}

class CC extends BB {
    public CC(){
        this("hello");
    }

    public CC(String name) {
        super("HaHaHa");
        System.out.println("CC(String name)");
    }
}