package com.java.class16;
//        Write a program to print
//        greatest digit from the
//        given number
//
//        input - 367678
//        output - 8
//
//        input - 872439
//        output - 9
import java.util.Scanner;

public class MaxDigitFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            if(lastDigit > max){
                max = lastDigit;
            }

            num = num / 10;
        }

        System.out.println(max);
    }
}
