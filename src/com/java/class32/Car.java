package com.java.class32;

public class Car {

    private int speed;
    private String color;
    public int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(){
        System.out.println("From Car Constructor");
    }

    // Getters
    public int getSpeed(){
        return speed;
    }

    // Setters
    public void setSpeed(int speed){
        // All your logic to identify the transaction log
        this.speed = speed;
    }

}
