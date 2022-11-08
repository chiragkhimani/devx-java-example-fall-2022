package com.java.class19;

//      1
//     123
//    12345
//   1234567
//  123456789


public class Homework3Patter3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {

            for(int space=1; space<=5-row; space++){
                System.out.print(" ");
            }

            for (int col = 1; col <= row * 2 - 1; col++) {
                System.out.print(col);
            }

            System.out.println();
        }


    }
}
