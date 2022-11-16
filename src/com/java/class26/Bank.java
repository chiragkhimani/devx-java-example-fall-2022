package com.java.class26;

public class Bank {

    double balance;
    String accName;
    String accNumber;

    Bank(String accNameFromUser, double balFromUser){
        accName = accNameFromUser;
        balance = balFromUser;
        accNumber = accName + balance;
    }

    Bank(){
        System.out.println("This is hi from Constructor");
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayPersonalDetails() {
        System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
    }

}

