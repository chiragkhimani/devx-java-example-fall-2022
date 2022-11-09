package com.java.class23;

//Write a program to find all duplicates number from the array
//        Example
//        Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//        Output : Duplicate numbers - 23, 44
public class Homework3 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    System.out.println(data[i]);
                    break;
                }
            }

        }

    }
}
