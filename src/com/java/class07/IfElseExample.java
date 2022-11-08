package com.java.class07;

import java.util.Scanner;

// Write a program to get two numbers from user and print maximum number
public class IfElseExample {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = sc.nextInt();

        System.out.println("Please enter second number: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("Maximum num is " + a);
        }else {
            System.out.println("Maximum num is " + b);
        }
    }
}
