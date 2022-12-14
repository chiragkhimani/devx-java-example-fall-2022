package com.java.class39;

public class FinallyExample {
    public static void main(String[] args) {

        String str = null;
        System.out.println(str.length());

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[2]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Nice To See You");
        }

    }
}
