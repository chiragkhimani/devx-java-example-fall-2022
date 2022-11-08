package com.java.class16;

// Java program to print the sum of even numbers from 1 to 10

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=2; i<=10; i=i+2){
                sum = sum + i;
        }

        System.out.println(sum);
    }
}
