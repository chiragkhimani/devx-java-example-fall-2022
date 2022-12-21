package com.java.class43;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FrequencyOfNames {
    public static void main(String[] args) {
        String names = "chirag maria gulnur ali " +
                "maryna max ali maria max " +
                "ali chirag yana maggie ali " +
                "yana maggie ali maryna max";

        String[] arrayOfNames = names.split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String name : arrayOfNames) {
            if (frequency.containsKey(name)) {
                frequency.put(name, frequency.get(name) + 1);
            } else {
                frequency.put(name, 1);
            }
        }

        System.out.println(frequency);


    }
}
