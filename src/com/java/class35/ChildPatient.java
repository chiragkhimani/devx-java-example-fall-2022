package com.java.class35;

public class ChildPatient extends Patient {

    @Override
    public void takeTylanol() {
        System.out.println("your recommended dose is 5ml");
    }

    public double takePayment(double originalBalance, double amountReceived) {
       double discount = 0.1;

       return (originalBalance - (originalBalance*discount)) - amountReceived;
    }

}
