package com.java.class34;


//Homework
//Whenever you are creating concrete iphones ask the user to input model, color, iOsversion in the contructor.
public class BaseIphone {

    //Parameters of a class
    private String model;
    private int memoryInMg;
    private String color;
    private String iOSVersion;


    //contructors that initializes all parameters
    public BaseIphone(String model, int memoryInMg, String color, String iOSVersion) {
        this.model = model;
        this.memoryInMg = memoryInMg;
        this.color = color;
        this.iOSVersion = iOSVersion;
    }

    public String writeAMessage(String messages) {
        return messages;
    }


    public String writeAnote(String note) {
        return note;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoryInMg() {
        return memoryInMg;
    }

    public void setMemoryInMg(int memoryInMg) {
        this.memoryInMg = memoryInMg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }


    @Override
    public String toString() {
        return "BaseIphone{" +
                "model='" + model + '\'' +
                ", memoryInMg=" + memoryInMg +
                ", color='" + color + '\'' +
                ", iOSVersion='" + iOSVersion + '\'' +
                '}';
    }

}
