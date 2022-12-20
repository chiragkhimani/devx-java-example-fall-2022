package com.java.class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();
        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        // Using Index Based For Loop
        for (int i = 0; i < listOfData.size(); i++) {
            System.out.println(listOfData.get(i));
        }

        // For Each Loop
        for (int item : listOfData) {
            System.out.println(item);
        }

        // Using Iterator
        Iterator<Integer> itr = listOfData.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
