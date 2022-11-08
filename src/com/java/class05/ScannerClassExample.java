package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();

        System.out.println("Your sum of two num is: " + (a + b));
    }
}
