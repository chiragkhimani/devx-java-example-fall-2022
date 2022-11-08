package com.java.class10;
// Find output of the below program
public class IfElseRevisionExample6 {
    public static void main(String[] args) {
        int i=10, j=20;

        if(i <= 10 && j > i || j<=i){
            j = j + 30; // j = 50
        }else{
            i = i + 30;
        }

        if(i > j){
            i = i + j;
        }else{
            j = i + j; // j = 60
        }

        System.out.println(i); // 10
        System.out.println(j); // 60
    }
}
