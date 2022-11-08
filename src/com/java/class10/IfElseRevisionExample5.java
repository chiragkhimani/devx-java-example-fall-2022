package com.java.class10;
// Find output of the below program
public class IfElseRevisionExample5 {
    public static void main(String[] args) {
        int i = 10, j = -5, k = 11;

        if(i + 1 <= k && j <= 11){
            k = i + j; // k = 5

            if(i <= k || k + 10 > k + 12){
                System.out.println("1");
            }else{
                System.out.println("2");
            }

            if(k >= j || k >= (i+j)){
                System.out.println("3");
            }else{
                System.out.println("4");
            }

        }else{
            System.out.println("5");
        }

        System.out.println("we will coffee for sure");
    }
}
