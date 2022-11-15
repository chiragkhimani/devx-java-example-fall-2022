package com.java.class23;

    //Write a program to find all duplicates number from the array
//        Example
//        Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//        Output : Duplicate numbers - 23, 44
public class Homework3 {
    public static void main(String[] args) {

        int data[] = {43, 44, 37, 37, 43, 43, 44, 17, 44, 44, 17};


        // Outer for loop - go over each number one by one
        for (int i = 0; i < data.length - 1; i++) {

            // inner for loop - go over rest of the numbers starting from number next to the number at position i
            for (int j = i + 1; j < data.length; j++) {

                // compare each number with rest of the number
                if (data[i] == data[j]) {

                    // If it's already printed do not print
                    System.out.println(data[i]);
                }

            }
        }
    }


}
