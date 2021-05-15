package com.benkyou.transformation;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStream_ {
    public static void main(String[] args) throws Exception {
        PrintStream out = System.out;

        // print底层使用的是 write,所以我们可以直接调用 write 进行打印/输出
        // 只会输出一句
        out.print("Hello.\n");
        out.write("hello\tworld".getBytes(StandardCharsets.UTF_8));
        out.close();

    }
}
