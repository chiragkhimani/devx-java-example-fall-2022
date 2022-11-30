package com.java.class32;

public class WrapperClassExample {
    public static void main(String[] args) {
        int i = 10;
        Integer j = i; // Wrapping

        Double d = 34.5;

        // Wrapping - Converting primitive data type to object
        System.out.println(j);


        // Use of Wrapper Class - To convert String to int & int to String

        String str1 = new String("23");
        String str2 = "46";
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        System.out.println(String.valueOf(j)); // String value of j
    }
}
