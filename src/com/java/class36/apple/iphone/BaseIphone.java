package com.java.class36.apple.iphone;


import com.java.class36.apple.Charger;
import com.java.class36.apple.Locker;
import com.java.class36.apple.Messanger;

public abstract class BaseIphone implements Charger, Locker, Messanger {
    private int batteryLevel;
    private String messageText;
    private boolean isLocked;

    @Override
    public void chargeBattery() {
        batteryLevel++;
    }

    @Override
    public void sendMessage(String text) {
        messageText = text;
    }

    @Override
    public void readMessage() {
        System.out.println(messageText);
    }

    @Override
    public void lock() {
        System.out.println("Locked");
    }
}
