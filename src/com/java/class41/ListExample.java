package com.java.class41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        listOfData.remove(new Integer(10)); // remove data 10

        listOfData.remove(2); // remove element at index 2

        System.out.println(listOfData);

        System.out.println(listOfData.size());

        System.out.println(listOfData);

        System.out.println(listOfData.get(0));

        System.out.println(listOfData.contains(20));

        System.out.println(listOfData.isEmpty());

        System.out.println(listOfData);

    }
}
