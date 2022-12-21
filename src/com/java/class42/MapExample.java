package com.java.class42;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();

        personAge.put("chirag", 35);
        personAge.put("chirag", 29);
        personAge.put("kris", 29);
        personAge.put("maria", 18);
        personAge.put("Gulnur", 29);
        personAge.put("chirag", 40);
        personAge.put("maria", 8);
        personAge.put(null, 30);
        personAge.put(null, 35);

        System.out.println(personAge);

        // List of keys
        Set<String> setOfNames = personAge.keySet();

        for (String name : setOfNames) {
            System.out.println(name + " = " + personAge.get(name));
        }

        // Retrieving collections of pair
        Set<Map.Entry<String, Integer>> pairs = personAge.entrySet();

        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair.getKey() + "=" + pair.getValue());
        }


        System.out.println(personAge.get("maria"));
        System.out.println(personAge.get("chirag"));


    }
}
