package com.java.class04;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Everyone";
        int num1 = 10;
        int num2 = 20;

        // We are learning String Concatenation
        System.out.println(str1 + str2); // Concatenation
        System.out.println(str1 + num1); // Concatenation
        System.out.println(str1 + num1 + num2); // Concatenation
        System.out.println(num1 + num2 + str1); // Add, Concat
        System.out.println(str1 + (num1 + num2)); // Hello30

        System.out.println(str1 + num1 * num2); // Hello200
        System.out.println(str1 + num1 + num2 + str2); // Hello1020Everyone
   //     System.out.println(str1 + num1 - num2); // Error
        System.out.println(num1 + "num2" + str1);
        System.out.println(str1 + (num2 - num1));
    }
}
