package com.java.class18;

// Write a program to check given number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        int orignalNum = num;
        int rev = 0;

        while(num!=0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if(orignalNum == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
