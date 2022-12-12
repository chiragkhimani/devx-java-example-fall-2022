package com.java.class35;

public class SeniorPatient extends Patient{

    @Override
    public void takeTylanol() {
        System.out.println("your recommended dose is 500mg");
    }


    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.4;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
