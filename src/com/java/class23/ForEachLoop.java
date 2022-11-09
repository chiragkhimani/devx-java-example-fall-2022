package com.java.class23;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 44, 35};

        // Printing all elements of array using index based for loop
        // Iterating / Traversing
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // Print all elements of array using for each loop / enhance for loop
        for (int num : data) {
            System.out.println(num);
        }


    }
}
