package com.java.class35;

public class GeneralPatient extends Patient{
    public void takeTylanol() {
        System.out.println("your recommended dosage is 250 mg");
    }


    @Override
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.0;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}



//the task is:
//to create