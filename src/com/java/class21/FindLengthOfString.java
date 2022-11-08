package com.java.class21;

import java.util.Scanner;
// Write a program to print length of the String
// without using .length() function
// Example - Java is Great
// Output - 13
// You can use length function in the for loop
public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine(); // Chirag Khimani

        int count = 0;

        while(!name.isEmpty()){
            count++;
            name = name.substring(1);
        }


        System.out.println(count);


    }
}
