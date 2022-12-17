package com.java.class41;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();

        intBox.setData(10);
        System.out.println(intBox.getData());

        Box<String> stringBox = new Box<String>();

        stringBox.setData("Chirag");
        System.out.println(stringBox.getData());

    }
}
