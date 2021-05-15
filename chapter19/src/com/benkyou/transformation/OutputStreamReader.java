package com.benkyou.transformation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamReader {
    public static void main(String[] args) throws Exception {
        String filePath = "d:/d.txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("愛してる\r");
        osw.write("i love u\r");
        osw.write("我爱你\r");
        osw.close();
    }
}
