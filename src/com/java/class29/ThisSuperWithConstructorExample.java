package com.java.class29;

class Animal {

    Animal(int a){
        this(a, 20);
    }
    Animal(int a, int b){
        System.out.println(b);
        System.out.println(a);
    }
}

class Dog extends Animal {
    Dog(int a){
        super(a);
    }
}

public class ThisSuperWithConstructorExample {
    public static void main(String[] args) {
        Dog d = new Dog(30);
    }
}
