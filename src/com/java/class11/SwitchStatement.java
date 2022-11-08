package com.java.class11;

import java.util.Scanner;

// Print given number in word (0-5)
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Please enter number from 0 to 5 only");
        }
    }
}
