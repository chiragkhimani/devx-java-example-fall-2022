package com.java.class36;

public class TestInterface {

    public static void main(String[] args) {
//        FirstInterface i = new FirstInterface();
        //Polymorphism => an ability to take different shapes
        //Dynamic polymorphism => you dont know what type of object
        //you are going to create in advance
        //you can choose what type of object to create during the runtime
        FirstInterface i = new Subclass();
        i.play();

        //to call static methods and variables
        //use classname only
        System.out.println(FirstInterface.COPY_RIGHT);
        System.out.println(FirstInterface.COPY_RIGHT);


        //Where to use static variables vs instance variable?
        //Instance variable => characteristics(attributes) of Object.
        //if you want the info to be unique for each Object use instance variables

        //if you have a pience of info that doesnt belong to any object.
        //piece of info that's just an info that about anyone,anybody, anything


        double total = (100 * FirstInterface.VA_TAX) + 100;



    }
}
