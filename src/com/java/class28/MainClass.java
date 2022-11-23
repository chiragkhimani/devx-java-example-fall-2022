package com.java.class28;

public class MainClass {
    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        b.sum(10,20);
        b.sub(10,20);

        AdvanceCalculator ac = new AdvanceCalculator();
        ac.mul(10,20);
        ac.div(10,20);
        ac.sub(10,20);
        ac.sum(10,20);
    }
}
