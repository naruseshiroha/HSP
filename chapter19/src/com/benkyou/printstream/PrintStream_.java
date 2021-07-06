package com.benkyou.printstream;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStream_ {
    public static void main(String[] args) throws Exception {
        // PrintStream 输出数据的位置是 标准输出,即显示器
        PrintStream out = System.out;
        // public void print(String s) {
        // write(String.valueOf(s));
        // }
        // public static String valueOf(Object obj) {
        // return (obj == null) ? "null" : obj.toString();
        // }

        // print底层使用的是 write,所以我们可以直接调用 write 进行打印/输出
        // 只会输出一句
        out.println("Hello.");
        out.write("hello\tworld".getBytes(StandardCharsets.UTF_8));
        out.close();

        // 我们可以去修改打印流输出的位置/设备
        // public static void setOut(PrintStream out) {
        // checkIO();
        // setOut0(out); private static native void setOut0(PrintStream out);
        // }
        System.setOut(new PrintStream("D:\\HSP\\chapter19\\ps.txt"));
        System.out.println("hello ps.txt");

    }
}
