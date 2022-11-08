package com.java.class15;

// Write a program to print sum of 1 to 5
// Output - 15
public class SumOf1to5 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            result = result + i;
        }

        System.out.println(result);

    }
}
