package com.java.class16;
// Write a program to print
// length of given number
// Input - 3543346
// Output - 7

import java.util.Scanner;

public class FindLengthOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
