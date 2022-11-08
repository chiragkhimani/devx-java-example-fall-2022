package com.java.class06;

import java.util.Scanner;

public class ConvertAgeFromYearsToDaysMonthsMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age in years: ");
        int age = sc.nextInt();

        System.out.println("You have spend "+ age * 12 +" months");
        System.out.println("You have spend "+ age * 365 +" days");
        System.out.println("You have spend "+ age * 365 * 24 * 60 +" mins");
    }
}
