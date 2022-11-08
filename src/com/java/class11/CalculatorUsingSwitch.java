package com.java.class11;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter your operation: ");
        String operation = sc.next();

        switch (operation.toLowerCase()){
            case "add":
            case "+":
                System.out.println(num1 +  num2);
                break;

            case "sub":
            case "-":
                System.out.println(num1 -  num2);
                break;

            case "mul":
            case "*":
                System.out.println(num1 *  num2);
                break;

            case "div":
            case "/":
                System.out.println(num1 /  num2);
                break;

            case "mod":
            case "%":
                System.out.println(num1 %  num2);
                break;

            default:
                System.out.println("Please choose right operation");
        }
    }
}
