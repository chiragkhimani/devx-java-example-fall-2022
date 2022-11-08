package com.java.class05;

public class RecapExpression {
    public static void main(String[] args) {
        System.out.println(12 * 2 / 6 * (2 + 6 / 10) - 20 * (3 - 8));
        System.out.println(12 / 24.0 * 6 + 4);

        // By default, java will consider whole number as an int
        int num = 24;
        // By default, java will consider decimal number as a double
        double num1 = 24.0;

        System.out.println(10 * 5.0 / 20  +"Hello" + 12 * 5);
    }
}
