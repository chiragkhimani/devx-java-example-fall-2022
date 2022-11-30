package com.java.class31;

import com.java.class32.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(500);
        c.price = 34534534;
        System.out.println(c.getSpeed());
    }
}
