package com.java.class42;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();

        personAge.put("chirag", 35);
        personAge.put("chirag", 29);
        personAge.put("kris", 29);
        personAge.put("maria", 18);
        personAge.put("Gulnur", 29);
        personAge.put("chirag", 40);
        personAge.put("maria", 25);
        personAge.put(null, 30);
        personAge.put(null, 35);

        System.out.println(personAge);
    }
}
