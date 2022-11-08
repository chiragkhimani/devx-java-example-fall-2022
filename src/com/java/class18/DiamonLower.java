package com.java.class18;

//*********
// *******
//  *****
//   ***
//    *
public class DiamonLower {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {

            for(int sp =1; sp<=5-i; sp++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
