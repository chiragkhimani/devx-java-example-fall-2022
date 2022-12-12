package com.java.class36;

//implicitly -> hidden, happening in the background
//explicitly -> obvious, open, directly.
//instead of writing extends we write implements
//just like in abstract classes
public class Subclass implements FirstInterface{
    //you must override the abstract method from interface
    //all method overriding rules apply
    public void play(){
        System.out.println("Play");
    }
}
