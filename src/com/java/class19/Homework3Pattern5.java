package com.java.class19;

//    1
//   000
//  11111
// 0000000
//111111111
// 0000000
//  11111
//   000
//    1


public class Homework3Pattern5 {
    public static void main(String[] args) {
        // Upper Triangle
        for(int row=1; row<=5; row++){

            for(int space=1; space<=5-row; space++){
                System.out.print(" ");
            }

            for (int col = 1; col <= row * 2 - 1; col++) {
                    System.out.print(row % 2);
            }
            System.out.println();
        }

        // Lower Triangle
        for(int row=1; row<=4; row++){

            for(int space=1; space<=row; space++){
                System.out.print(" ");
            }

            for(int col=1; col<=9-2*row; col++){
                System.out.print((row+1) % 2);
            }
            System.out.println();
        }

    }
}
