package com.java.class29;

// You call a Constructor from another constructor only
// You can call a constructor from another constructor,
// but it has to be called in the first line only
class Bank1 {
    // Constructor of Parent Class
    Bank1(int balance) {
        System.out.println("From Bank " + balance);
    }

}
class CitiBank extends Bank1 {
    // Constructor of Child
    CitiBank(int a, double b) {
        super(a);
        System.out.println("I still have double values "+ b);
    }

    CitiBank(){
        super(500);
    }
}

public class SuperWithConstructor {
    public static void main(String[] args) {
        CitiBank b = new CitiBank();
    }
}
