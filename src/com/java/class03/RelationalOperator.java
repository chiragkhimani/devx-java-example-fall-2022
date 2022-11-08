package com.java.class03;

public class RelationalOperator {
    public static void main(String[] args) {
            int a = 10, b = 11;
            System.out.println(a > b); // false
            System.out.println(a < b); // true
            System.out.println(a >= b); // false
            System.out.println(a <= b); // true
            System.out.println(a != b); // true
            System.out.println(a == b); // false

            int c = 10, d = 10;
            System.out.println(c > d); // false
            System.out.println(c < d); // false
            System.out.println(c >= d); // true
            System.out.println(c <= d); // true
            System.out.println(c != d); // false
            System.out.println(c == d); // true
    }
}
