package com.java.class27;

class Demo {
    int balance = 50;

    public void method1() {
        int balance = 40;
        System.out.println(balance);

    }
}


public class TypesOfVariablesExample1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.balance);
        d.method1();
        d.method1();
        System.out.println(d.balance);
    }
}
