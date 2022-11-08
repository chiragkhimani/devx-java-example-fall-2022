package com.java.class06;

public class TypeCastingExample3 {
    public static void main(String []args){
        double d = 2.5;
        int a = 10;
        short s = 20;
        byte b = 100;

        int num = (int)d;
        double d1 = num;
        double d2 = a;
        b = (byte)s;

        System.out.println(num);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b);

    }
}
