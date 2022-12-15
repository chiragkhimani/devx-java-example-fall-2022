package com.java.class40;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int data[] = {23,34,76,32,76};

        Scanner sc  = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=0; i<count; i++){
            System.out.println(data[i]);
        }
    }
}
