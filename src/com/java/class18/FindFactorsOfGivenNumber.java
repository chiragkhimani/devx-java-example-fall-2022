package com.java.class18;

// Factor of 6 - 1, 2, 3, 6
// Factor of 10 - 1, 2, 5, 10
// Write a program to find Factors of Given Number

import java.util.Scanner;

public class FindFactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}
