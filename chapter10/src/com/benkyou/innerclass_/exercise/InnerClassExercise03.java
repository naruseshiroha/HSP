package com.benkyou.innerclass_.exercise;

public class InnerClassExercise03 {
    public static void main(String[] args) {
        InnerClassExercise03 t = new InnerClassExercise03(); // 5
        Inner r = t.new Inner();
        System.out.println(r.a); // 5
    }

    public InnerClassExercise03() {
        Inner inner = new Inner();
        inner.a = 10;
        Inner inner1 = new Inner();
        System.out.println(inner1.a);
    }

    class Inner {
        public int a = 5;
    }
}


