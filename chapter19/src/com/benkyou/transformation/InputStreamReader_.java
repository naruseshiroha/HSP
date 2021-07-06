package com.benkyou.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\HSP\\chapter19\\c.txt";

        // 1.把 FileInputStream 转成 InputStreamReader
        // 2.指定编码 GBK
        // InputStreamReader isr = new InputStreamReader
        // (new FileInputStream(filePath), StandardCharsets.UTF_16LE);
        // 3.把 InputStreamReader 传入 BufferedReader
        // BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_16LE));

        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }
        br.close();
    }
}
