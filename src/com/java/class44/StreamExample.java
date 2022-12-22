package com.java.class44;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        listOfData.stream().forEach(y->System.out.println(y));
    }
}
