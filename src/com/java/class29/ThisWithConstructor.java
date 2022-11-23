package com.java.class29;

// You call a Constructor from another constructor only
// You can call a constructor from another constructor,
// but it has to be called in the first line only
class Bank {

    Bank() {
        this(10);
        System.out.println("From Bank");
    }

    Bank(int balance) {
        this(10, 20.0);
        System.out.println("From Bank " + balance);
    }

    Bank(int a, double b) {
        this(b, "Hello");
    }

    Bank(double a, String name) {

    }

}


public class ThisWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank();
    }
}
