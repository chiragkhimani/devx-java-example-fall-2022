package com.java.class24;

// Write a program to print sum of each row from 2D array
// output
// 88
// 118
// 87
public class SumOfElementRowWise {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };

        int sum = 0;

        for (int i = 0; i < info.length; i++) {

            sum = 0;
            for (int j = 0; j < info[i].length; j++) {
                sum = sum + info[i][j];
            }
            System.out.println(sum);

        }

    }
}
