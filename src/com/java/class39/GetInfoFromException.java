package com.java.class39;

public class GetInfoFromException {
    public static void main(String[] args) {

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[3]);

            String str = null;
            System.out.println(str.length());
        } catch (Exception e) { // This catch has to be at the end only
            System.out.println(e.toString());
        }

        System.out.println("Nice to see you");

    }
}
