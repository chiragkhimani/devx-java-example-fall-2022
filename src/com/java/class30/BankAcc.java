package com.java.class30;

class Bank {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void displayRateOfInterest() {
        System.out.println("4%");
    }
}

class ChaseBank extends Bank {
    void displayRateOfInterest() {
        System.out.println("6%");
    }
}

class BankOfAmerica extends Bank {
    void displayRateOfInterest() {
        System.out.println("3%");
    }
}

class CitiBank extends Bank {
    void displayRateOfInterest() {
        System.out.println("5%");
    }
}

public class BankAcc {
    public static void main(String[] args) {
        ChaseBank c = new ChaseBank();
        BankOfAmerica ba = new BankOfAmerica();
        ba.displayRateOfInterest();
    }
}

