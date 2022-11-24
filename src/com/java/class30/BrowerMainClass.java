package com.java.class30;

import java.util.Scanner;

public class BrowerMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name ");
        String browser = sc.next();

        Browser b;

        if (browser.equalsIgnoreCase("chrome")) {
            b = new Chrome();
        } else {
            b = new FireFox();
        }

        b.openIncognitoWindow();

    }
}
