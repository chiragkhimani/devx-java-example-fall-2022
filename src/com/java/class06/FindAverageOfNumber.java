package com.java.class06;

import java.util.Scanner;

public class FindAverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = sc.nextInt();

        System.out.println("Please enter second number: ");
        int b = sc.nextInt();

        System.out.println("Please enter third number: ");
        int c = sc.nextInt();

        double result = (a + b + c) / 3.0;

        System.out.println("Average is " + result);

    }
}
