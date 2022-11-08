package com.java.class22;

// Write a program to find index of the number
// 12, 34, 56, 23, 76, 33, 76, 32, 21
// 76
// Output - 4
public class FindIndexOfNumber {

    public static void main(String[] args) {
        int data[] = {12, 34, 56, 23, 76, -1, 74, 32, 21};
        int targetNum = -1;

        int foundIndex = findIndex(data, targetNum);

        if(foundIndex==-1){
            System.out.println("Number not found");
        }else{
            System.out.println(foundIndex);
        }
    }

    static int findIndex(int[] data, int targetNumber) {

        for (int i = 0; i < data.length; i++) {
            if(data[i] == targetNumber){
                return i;
            }
        }
        return -1;
    }

}
