package com.java.class13;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number");
        int num3 = sc.nextInt();
        System.out.println("Please enter fourth number");
        int num4 = sc.nextInt();

        int max1 = findMax(num1, num2);
        int max2 = findMax(num3, num4);

        System.out.println("Greatest number " + findMax(max1, max2));
    }

    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int findMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
