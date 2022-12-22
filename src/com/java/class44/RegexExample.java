package com.java.class44;

public class RegexExample {
    public static void main(String[] args) {
        String str = "This is chirag and this is chirag class and we know chirag";

        System.out.println(str.replace("chirag","baiat"));


        String title2 = "USD 200 inclusive of tax";
        System.out.println(title2.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[\\s]",""));
    }
}
