package com.java.class21;

import java.util.Scanner;

// Write a program to print reverse of given String
// inmaihK garihC

public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine(); // Chirag Khimani

        for(int i=name.length()-1; i >=0; i--){
            System.out.print(name.charAt(i));
        }

        System.out.println();

        // Another approach
        for(int i=0; i < name.length(); i++){
            System.out.print(name.charAt(name.length()- 1 - i));
        }




    }
}
