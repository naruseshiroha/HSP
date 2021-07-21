package com.benkyou.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework03 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);

        hashMap.put("jack", 2600);

        hashMap.entrySet().stream()
                .peek(e -> e.setValue(e.getValue() + 100))
                .forEach(System.out::println);
        System.out.println("---------");
        hashMap.values().forEach(System.out::println);
    }
}
