package com.java.class28;

class Factory {
    Factory() {
        System.out.println("1.From Factory");
    }
}

class Vehicle extends SportsCar {
    Vehicle() {
        System.out.println("2.From Vehicle");
    }
}

class SportsCar extends Factory {
    SportsCar() {
        System.out.println("3.From Sports Car");
    }
}

class Car extends SportsCar {
    Car() {
        System.out.println("4.From Car");
    }
}


