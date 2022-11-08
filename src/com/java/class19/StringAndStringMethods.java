package com.java.class19;

public class StringAndStringMethods {
    public static void main(String[] args) {
        String object1 = "Hello";
        String object2 = "Hello";
        String object3 = new String("Hello");
        String object4 = new String("Hello");
        int a = 20;

        System.out.println(object1 == object2); // true
        System.out.println(object1 == object3); // false
        System.out.println(object3 == object4); // false

        System.out.println(object1.equals(object2)); // true
        System.out.println(object1.equals(object3)); // true
        System.out.println(object3.equals(object4)); // true

        // '==' compare address of the memory instead of content
        // .equals compare the content of the String
    }
}
