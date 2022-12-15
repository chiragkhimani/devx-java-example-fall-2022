package com.java.class40;

import java.util.Scanner;

public class UnCheckedException {
    public static void main(String[] args) {
        openBrowser();
    }

    public static void openBrowser() {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();

        if (browser.equals("Chrome")) {
            System.out.println("Opening Chrome");
        } else if (browser.equals("Firefox")) {
            System.out.println("Opening Firefox");
        } else {
                throw new RuntimeException("Invalid Browser");
        }
    }
}
