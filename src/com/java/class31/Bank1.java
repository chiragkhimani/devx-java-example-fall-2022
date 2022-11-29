package com.java.class31;

public class Bank1{
    private int balance;
    String accNumber;
    public String accName;
    protected String nomineeDetails;
}

class AmexBank extends Bank1{
    void method1(){
        // System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
        System.out.println(nomineeDetails);
    }
}

class MainEncapsulationExample {
    public static void main(String[] args) {

    }
}
