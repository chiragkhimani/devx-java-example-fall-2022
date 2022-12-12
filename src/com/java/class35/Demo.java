package com.java.class35;

import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {
        //calculate payments

        //ask a user for it's age
        //if the age is less than 10 y.o create childPatient
        //if the age is more or equal to  10 and less than 60 y.o create generalPatient
        //if the age is more or equal to  60  y.o create seniorPatient
        //ask the user to enter their balance
        //ask how much they want to pay
        //apply their discount if applicable
        //return their remaining balance

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();


        System.out.println("What is your balance");
        double balance = scanner.nextDouble();

        System.out.println("how much do want to pay?");
        double amountReceived = scanner.nextDouble();


        //what dymanic polymorphism?
        //you can decide what object to initialize during the runtime
        //the Parent class variable should be able to hold any of the child class objects
        //this helps to write the logic once.

        Patient patient;
        if (age<10)
        {
            patient = new ChildPatient();
        }
        else if (age < 60){
            patient = new GeneralPatient();
        }
        else {
            patient = new SeniorPatient();
        }


        //in order to be able to apply Dynamic polymorphism and call one method from
        //different child Objects
        //the method must be defined in the parent class.
        //but which version of the method is going to be executed
        //depends on what child object is instantiated
        double remainingBalance = patient.takePayment(balance, amountReceived);
        System.out.println("your remaining balance is " + remainingBalance);


        //ToString()
        //hashCode()
        //equals()
        //from Object class

    }



}
