package com.java.class08;

import java.util.Scanner;

public class LadderIfElseHomeworkExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your marks: ");
        int marks = sc.nextInt();

        if (marks > 100) {
            System.out.println("Please enter valid marks (0-100)");
        } else if (marks < 0) {
            System.out.println("Please enter valid marks (0-100)");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B+");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C+");
        } else if (marks >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        } // else block ends here
    } // main method ends here

} // class ends here
