package com.benkyou.codeblock_.exercise;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        new Test();
        /*
        1.Sample2 ... 2.Test static code block is called ...
        3.Sample1 ... 4.Test code block 5."Test() is called ..."
         */
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample() is called ...");
    }

}

class Test {
    Sample sample = new Sample("Sample1 ...");
    static Sample sample2 = new Sample("Sample2 ...");

    static {
        System.out.println("Test static code block is called ...");
        if (sample2 == null)
            System.out.println("sample2 is null.");
    }

    Test() {
        System.out.println("Test() is called ...");
    }

    {
        System.out.println("Test code block");
    }
}