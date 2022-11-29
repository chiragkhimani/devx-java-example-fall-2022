package com.java.class31;

public class Bank {
    int balance;

    public void checkBalance() {
        System.out.println(balance);
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Available balance - " + balance);
    }

    public void displayRateOfInterest() {
        System.out.println("7.0");
    }

}


class ChaseBank extends Bank{
    public void displayRateOfInterest() {
        System.out.println("7.0");
    }
}

class BankOfAmerica extends Bank{
    public void displayRateOfInterest() {
        System.out.println("8.0");
    }
}

class WellsFargo extends Bank{
    public void displayRateOfInterest() {
        System.out.println("3.0");
    }
}
