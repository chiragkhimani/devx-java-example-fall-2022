package com.java.class36;

//Interface just like an abstract class can not be instantiated
//interface can not be marked final => bc the whole point of interface is to
//be IMPLEMENTED(extended)
//can not be declared private or protected

//??Why do we need interfaces?
//Interfaces are need to tell the subclasses what they must do
//but not how to do it.
//Interfaces are very similar to abstact classes
//but the biggest difference is that
//abstact classes can have characteristics(instance variables)
//Whereas in Interfaces you only have behavior(method).
//plus abstact classes can also have non-abstract methods that are common for
//all sub-classes.
public interface FirstInterface {

    //if it was apple program
    //public static final variables are called constants
    //variable naming convention is to use all caps with underscored
    public static final String COMPANY_NAME = "Apple inc.";

    public static final String COPY_RIGHT = "These guidelines are for Apple licensees, " +
            "authorized resellers, developers, customers, and other parties wishing to use" +
            " Apple’s trademarks, service marks or images in promotional, advertising, instructional, " +
            "or reference materials, or on their web sites, products, labels, or packaging. " +
            "Use of the keyboard Apple Logo (Option-Shift-K) for commercial purposes without the prior written consent of " +
            "Apple may constitute trademark infringement and unfair competition in violation of federal and state laws. " +
            "Use of Apple trademarks may be prohibited, unless expressly authorized.";

    public static final double VA_TAX= 0.06;


    //in abstract classes you have to declare the method abstract explicitly
    //whereas in interfaces methods are by default public and abstract
    //one of the best coding practices is to remove redundant code.
    public abstract void play();


    //default methods are the methods that can have a body
    //default methods are just like instance methods
    public default void print(){
        System.out.println("Hello World");
    }

    //are not instance
    //you can not override them when inheriting
    //methods which are not executing any info about the object should be static
    //methods that do not use instance variable to get the job done should be static
    public static void scream(){
        System.out.println("Hello World");
    }
}

