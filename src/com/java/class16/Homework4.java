package com.java.class16;

import java.util.Scanner;

// Write a program to print each digit of the
// number into a separate line in reverse order
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num != 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
    }
}
