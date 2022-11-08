package com.java.class10;

// Write a Program To Count Total Number Of Minimum Notes In Given Amount
// (Notes are of 1, 2, 5, 10, 20, 100 & 500)
//         Example
//         Input  : Amount = 255
//         Output : 2 Notes of 100
//         2 Notes of 20
//         1 Note of 10
//         1 Note of 5

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int amount = sc.nextInt();

        int result = (amount / 500);
        if(result > 0) {
            System.out.println(result+" notes of 500");
            amount = amount % 500;
        }

        result = (amount / 100);
        if(result > 0) {
            System.out.println(result+" notes of 100");
            amount = amount % 100;
        }

        result = (amount / 20);
        if(result > 0) {
            System.out.println(result+" notes of 20");
            amount = amount % 20;
        }

        result = (amount / 10);
        if(result > 0) {
            System.out.println(result+" notes of 10");
            amount = amount % 10;
        }

        result = (amount / 5);
        if(result > 0) {
            System.out.println(result+" notes of 5");
            amount = amount % 5;
        }

        result = (amount / 2);
        if(result > 0) {
            System.out.println(result+" notes of 2");
            amount = amount % 2;
        }

        if(amount > 0) {
            System.out.println(amount +" notes of 1");
        }

    }
}
