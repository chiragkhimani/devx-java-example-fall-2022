package com.java.class07;

import java.util.Scanner;

// Write a program to take age from user and print weather they are
// eligible for driving license or not
public class IfElseExample2 {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you age: ");
        int age = sc.nextInt();

        if (age <= 16) {
            System.out.println("You're too young to drive");
        } else {
            System.out.println("You're eligible");
        }

    }
}
