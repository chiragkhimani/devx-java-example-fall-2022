package com.java.class12;

import java.util.Scanner;

public class FindReverseOfNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number (100 to 999): ");
        int num = sc.nextInt(); // For Example - 874

        int rev =  getReverse(num);

        System.out.println(rev);
    }

    static int getReverse(int num){
        int rev = 0;

        // Retrieve last digit from the number
        int lastDigit = num % 10; // Last Digit - 4
        // Combine last digit with previous value of reverse number
        rev = rev * 10 + lastDigit; // 0 * 10 + 4 = 4
        // Removing last digit from the number
        num = num / 10; // num = 87

        lastDigit = num % 10; // last digit = 7
        rev = rev * 10 + lastDigit; // 4 * 10 + 7 = 47
        num = num / 10; // num = 8

        lastDigit = num % 10; // last digit = 8
        rev = rev * 10 + lastDigit; // 47 * 10 + 8 = 478
        num = num / 10; // num=0

        return rev;
    }
}
