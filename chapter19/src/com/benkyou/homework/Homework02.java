package com.benkyou.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Homework02 {
    public static void main(String[] args) throws Exception {
        String filename = "d:\\HSP\\chapter19\\cx.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_16LE));
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(++i + line);
        }
        br.close();
    }
}
