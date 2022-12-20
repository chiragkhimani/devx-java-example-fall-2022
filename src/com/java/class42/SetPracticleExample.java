package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPracticleExample {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<String>();

        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Potato");
        listOfData.add("Tomato");
        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Orange");
        listOfData.add("Cucumber");
        listOfData.add("Mango");
        listOfData.add("Tomato");
        listOfData.add("Apple");
        listOfData.add("Banana");

        System.out.println(listOfData);

//        System.out.println("Unique Items in the list");
//        Set<String> uniqueItem = new HashSet<>();
//        uniqueItem.addAll(listOfData);

        // Find duplicate items in the given list
        // uniqueItem.add("banana"); // return true if banana was not present,
        // false if banana was present in the set
        Set<String> duplicateItems = new HashSet<>();
        Set<String> uniqueItem = new HashSet<>();

        for (String item : listOfData) {
            if (uniqueItem.add(item) == false) {
                duplicateItems.add(item);
            }
        }

        System.out.println("Duplicate items - " + duplicateItems);

    }
}
