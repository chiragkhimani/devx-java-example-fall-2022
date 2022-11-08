package com.java.class19;

// Write a program to print all the prime numbers from 1 to 100
public class Homework1 {
    public static void main(String[] args) {
        for (int i = 11; i <= 100; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        int divisor = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }

        if (divisor == 2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome(int num) {
        int orignalNum = num;
        int rev = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if (orignalNum == rev) {
            return true;
        } else {
            return false;
        }
    }
}
