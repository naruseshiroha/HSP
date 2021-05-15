package com.benkyou.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:/b.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        //
        //
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
