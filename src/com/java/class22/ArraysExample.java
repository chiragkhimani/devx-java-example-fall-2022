package com.java.class22;

// Arrays - Container to hold more than one values of SIMILAR data types
public class ArraysExample {
    public static void main(String[] args) {
        // Declaration of array

        int data[]; // Declaration will not initialize size in memory

        int a; // 4 bytes

        // Initialize the array
        // Important - In java when we want to initialize variable that can hold collection
        // of values we need to use new keyword
        data = new int[5];

        // Declaration and Initialization in same line
        int salary[] = new int[100]; // We don't know values, so we initialize with maximum capacity

        // Declaration and assignment in the same line
        int nums[] = {10, 20, 30, 34, 45, 23, 45, 23, 12, 65, 23}; // We can assign fixed set of numbers

        // Length of the Array
        System.out.println(nums.length); // 11

        // Print value at particular index
        System.out.println(nums[4]);

        // Print all data from array
        System.out.println("=======Print all data from array=======");
        for (int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }

        // Print default value of element of array
        System.out.println(salary[45]); // 0

        System.out.println(nums[21]); //





    }
}
