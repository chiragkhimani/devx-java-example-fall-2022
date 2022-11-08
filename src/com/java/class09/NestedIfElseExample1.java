package com.java.class09;

import java.util.Scanner;

// Write a program to get age and weight from the user and print message based on following conditions
// 1. user has age more than or equal to 18 and weight more than equal to 50
// then they are eligible for blood donation
// 2. If user has age less than 18 and weight greater than or equal 50 then
// print you're too young to donate blood
// 3. If user has age greater than 18 and weight less than 50 then
// print you're underweight. Please eat more and try again
// 4. If user has age less than 18 and weight less than 50 then
// print, you're not eligible
public class NestedIfElseExample1 {
    public static void main(String[] args) {
        // 1st approach - ladder if-else
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your weight: ");
        int weight = sc.nextInt();

        if(age >=18 && weight >= 50){
            System.out.println("You're eligible");
        }else if(age < 18 && weight >= 50){
            System.out.println("you're too young to donate blood");
        }else if(age >= 18 && weight < 50){
            System.out.println("you're underweight");
        }else{
            System.out.println("You're not eligible");
        }

        // 2nd approach - nested if-else
        if(age >= 18){
            if(weight >= 50){
                System.out.println("You're eligible");
            }else{
                System.out.println("you're underweight");
            }
        }else{
            if(weight >= 50){
                System.out.println("you're too young to donate blood");
            }else{
                System.out.println("you're not eligible");
            }
        }
    }
}
