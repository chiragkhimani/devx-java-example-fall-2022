package com.java.class18;

import java.util.Scanner;

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();

        for (int i = 1; i <= num/2 +1; i++) {

            for (int sp = 1; sp <= num - i; sp++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = num/2; i >= 1; i--) {

            for(int sp =1; sp<=num-i; sp++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
