package com.java.class25;

public class Bank {

    String accName;
    String accNumber;
    double balance;
    int routingNumber;
    char typeOfAccount;
    String currency;

    void deposit(double amount) {
        balance = balance - amount;
    }

    void withdraw(double amount) {
        balance = balance + amount;
    }

    void transferMoney(String accNumber, double amount) {
        System.out.println("Transferring " + amount + " to " + accNumber);
    }

}
