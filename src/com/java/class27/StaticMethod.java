package com.java.class27;

class Bike {
    static int speed;
    static int price = 10;
    int numOfGear;

    static void method1() {
        System.out.println(price);
    }

    static void method3() {
//        System.out.println(numOfGear); // this will give you compilation error as we cannot use instance variable in static methods
    }

    void method2() {
        System.out.println(speed);
    }


}

public class StaticMethod {
    public static void main(String[] args) {
        Bike.speed = 10;
        Bike.method1();
    }
}
