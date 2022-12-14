package com.java.class39;

public class MultipleException {
    public static void main(String[] args) {

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[3]);

            String str = "null";
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (NullPointerException e) {
            System.out.println("you are accessing null object");
        } catch (ArithmeticException e) {
            System.out.println("you are dividing with zero");
        } catch (Exception e) { // This catch has to be at the end only
            System.out.println("Something went wrong");
        }


    }
}
