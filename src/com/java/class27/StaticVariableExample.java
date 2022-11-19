package com.java.class27;

class Person {
    static int numOfPerson;

    Person() {
        numOfPerson++;
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Person vlad = new Person();
        Person maria = new Person();
        Person jasur = new Person();

        System.out.println(vlad.numOfPerson);
        System.out.println(maria.numOfPerson);
        System.out.println(jasur.numOfPerson);
    }
}
