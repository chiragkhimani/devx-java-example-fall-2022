package com.java.class05;

public class AssignmentOperatorPractice2 {
    public static void main(String[] args) {
        int a = 10, b = 15;

                    // a=10, b=15
        a = a * a; // a=100, b=15
        b = a * b; // a=100, b=1500

        b = a + b; // a=100, b=1600
        a = a + b; // a=1700, b=1600

        System.out.println(a);
        System.out.println(b);
    }
}
