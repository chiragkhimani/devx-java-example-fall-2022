package com.java.class05;


import java.util.Scanner;

// Write a program to swap values of the two variables
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c;

        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }
}
