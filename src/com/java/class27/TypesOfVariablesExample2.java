package com.java.class27;

class BankAcc {
    int balance = 50;

    public void method1() {
        System.out.println(balance);
        int balance = 40;
    }
}


public class TypesOfVariablesExample2 {
    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        System.out.println(b.balance);
        b.method1();
        b.method1();
        System.out.println(b.balance);
    }
}
