package com.java.class26;
public class MainClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();
        bmw.speed = 200;
        bmw.color = "White";

        // First approach
        bmw.speed = bmw.increaseSpeed(bmw.speed);

        // Second approach
        bmw.decreaseSpeed(audi); // bmw = yello,
                                // audi - black

        // Third approach
        bmw.makeSpeedZero();

        System.out.println(bmw.color); // black / Yello
        System.out.println(audi.color); // Red / Yello
    }
}
