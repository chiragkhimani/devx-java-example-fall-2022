package com.java.class40;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    // Compile Exception -    You need to handle it compulsory using try catch or
    //                        you can also use throws keyword to warn other methods

    // Runtime Exception -     Compiler doesn't complain when statements throwing
    //                         Run time exception, It's not compulsory to handle it

    public static void main(String[] args) {
            method2();
    }

    public static void method2()  {

    }

    public static void method1() throws FileNotFoundException {
            throw new FileNotFoundException("File Cannot be opened");
    }

}
