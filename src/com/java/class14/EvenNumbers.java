package com.java.class14;

public class EvenNumbers {
    public static void main(String[] args) {
        int i=1;

        while(i<=20){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Another Approach
        i = 2;
        while(i<=20){
                System.out.println(i);
                i = i + 2;
        }

        // Another Approach
        i = 1;
        while(i<=20){
            i++;
            System.out.println(i);
            i++;
        }
    }
}
