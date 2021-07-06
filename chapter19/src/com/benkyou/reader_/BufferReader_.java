package com.benkyou.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\HSP\\chapter19\\hello.txt";
        // 创建 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line; // 按行读取,效率高
        // 当返回 null 时读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
