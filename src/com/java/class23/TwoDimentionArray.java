package com.java.class23;

public class TwoDimentionArray {
    public static void main(String[] args) {
        // Declaration of 2D array
        int data[][];

        // Declaration and initialization of 2D array
        int nums[][] = new int[2][3];

        // Declare and assign in one line (It's new array and not relevant to above statements)
        int info[][] = {    {23, 44, 21},
                            {45, 42, 31},
                            {73, 14, 0}
                        };

        // Find number of rows in the array
        System.out.println(nums.length);

        // Find number of column in a row
        System.out.println(nums[0].length);

        // Print data at particular
        System.out.println(nums[1][1]);

        // Print all data from 2D array using index based for loop
        for(int i=0; i<info.length; i++){
            for(int j=0; j<info[i].length; j++){
                System.out.print(info[i][j]+" ");
            }
            System.out.println();
        }

    }
}
