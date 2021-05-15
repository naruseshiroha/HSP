package com.benkyou.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Properties01 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("src/mysql.properties");
        BufferedReader br = new BufferedReader(fileReader);
        String data;
        HashMap<String, String> map = new HashMap<>();
        while ((data = br.readLine()) != null) {
            String[] arr = data.split(" = ");
            map.put(arr[0], arr[1]);
        }
        System.out.println(map);
    }
}
