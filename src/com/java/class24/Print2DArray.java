package com.java.class24;

// Print given array into the console in the table format
public class Print2DArray {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };

        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }
    }
}
