package com.java.class26;

public class Car {
    int speed = 300;
    String color = "Red";

    void drive() {
        System.out.println("Driving " + color +
                " car at speed " + speed);
    }

    // Pass by value
    int increaseSpeed(int speed){
        speed = speed + 500;
        return speed;
    }

    // Pass by reference
    void decreaseSpeed(Car myCar){
        myCar.speed = myCar.speed - 200;
        myCar.color = "Black";
        color = "Yello";
    }

    void makeSpeedZero(){
        speed = 0;
    }
}
