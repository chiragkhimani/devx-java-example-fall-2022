package com.java.class39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter two numbers");
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Please enter number greater than zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter the whole number only");
        } catch (Exception e) {
            System.out.println("We ran into an error! Please try after sometime");
        }
        System.out.println("Nice to see you");
    }
}
