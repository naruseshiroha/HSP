package com.benkyou.transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\HSP\\chapter19\\d.txt";
        FileOutputStream fos = new FileOutputStream(filePath, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("我爱你\r");
        osw.write("i love u\r");
        osw.write("愛してる\r");
        osw.close();
    }
}
