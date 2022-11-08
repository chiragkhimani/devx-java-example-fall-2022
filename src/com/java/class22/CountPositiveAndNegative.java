package com.java.class22;

// Write a program to count number of +ve and -ve numbers from array
public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int data[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int countPositive = 0;
        int countNegative = 0;

        for(int i=0; i<data.length; i++){
            if(data[i] >= 0){
                countPositive++;
            }else{
                countNegative++;
            }
        }
        System.out.println(countPositive);
        System.out.println(countNegative);
    }
}
