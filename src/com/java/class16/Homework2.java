package com.java.class16;
// Java program to print the sum of 1 to 50 numbers
// which are divisible by 5 or by 3
// 3 5 6 9 10 12 15 18 20 21...




public class Homework2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
