package com.java.class15;

import java.util.Scanner;

public class CalculatorUsingDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int choice;
        do{
            System.out.println("Please enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Please enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Please enter your operation: ");
            String operation = sc.next();


            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;

                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;

                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;

                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;

                case "mod":
                case "%":
                    System.out.println(num1 % num2);
                    break;

                default:
                    System.out.println("Please choose right operation");
            }

            System.out.println("Do you want to try one more time?");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");
            choice = sc.nextInt();
        } while (choice == 1);
    }

}
