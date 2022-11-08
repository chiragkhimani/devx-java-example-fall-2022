package com.java.class05;

import java.util.Scanner;

public class ScannerClassExampleUsingString {
    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first word: ");
        String word1 = sc.nextLine();
        System.out.println("Please enter second word: ");
        String word2 = sc.nextLine();

        System.out.println("You Entered");
        System.out.println(word1);
        System.out.println(word2);
    }
}
