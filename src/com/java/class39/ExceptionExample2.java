package com.java.class39;

public class ExceptionExample2 {
    public static void main(String[] args) {

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        try {
            String str = "null";
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }
}
