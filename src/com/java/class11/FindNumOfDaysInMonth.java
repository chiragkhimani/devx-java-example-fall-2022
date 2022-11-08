package com.java.class11;

import java.util.Scanner;

//        Write a program to get month number from user and print number of days in the
//        given month (1 to 12 only)
//
//        Example
//
//        Input - 1
//        Output - 31 days
//
//        Input - 2
//        Output - 28/29 days
//
//        Input - 11
//        Output - 30 days

public class FindNumOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println("Please enter month number(1-12): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 2:
                System.out.println("28/29 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Please enter number from 1 to 12 only");
        }

    }
}
