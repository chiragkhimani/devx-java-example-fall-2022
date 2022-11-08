package com.java.class12;

import java.util.Scanner;

// Print greatest number out of three number
// Input - 10 20 30, Output - 30
public class FindGreatestNumberOutOfThreeNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();
        findGreatestNumber(num1, num2, num3);
    }


    // Method with arguments but no return value
    static void findGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is greatest");
        } else if (b > c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }


}
