package com.java.class08;

import java.util.Scanner;

// Print greatest number out of three number
// Input - 10 20 30, Output - 30
public class FindGreatestNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println(num3 + " is greatest");
        }
    }
}
