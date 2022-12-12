package com.java.class35;

//abstract classes can not be instantiated, initialized directly
//this is good for cases like BaseIphone vs concrete Iphones like Iphone7
//abstract classes can not be final. =>
//what happens if the class is final? => you cannot extend it. you can not change any values in it.
//Because the whole point of abstract classes is to be extended.
//abstract classes can not be market private.
public abstract class Patient {

    //abstract methods do not have any implementation
    //which means we know and require each child class to have a takeTylanol method
    //and should write the specific logic to each child class
    public abstract void takeTylanol();


    //we want to create a method to inquire the payments
    //ChildPatients should be given 10% disount from original fee
    //General Patients should be pay original fee
    //Seniors should be given 40% discount from original fee
    //Disabled patients should be given 20% fee

    //the method should take two param: 1)balance 2)an amountReceived param.
    //the method should calculate the discount - subtract amountReceived
    //and return remainingBalance.
    public abstract double takePayment(double originalBalance, double amountReceived);

}




//Patient varP = new Patient();
//you declare variable, not an object.
//intialize -> new object, or value(literal values)
//12
//"gdg"