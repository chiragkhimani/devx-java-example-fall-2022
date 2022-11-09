package com.java.class23;

public class SumOfArrayElementUsingForEachLoop {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 44, 35};

        int sum = 0;

        for (int num : data) {
            sum = sum + num;
        }

        System.out.println(sum);

    }
}
