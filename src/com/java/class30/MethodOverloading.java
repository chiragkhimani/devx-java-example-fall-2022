package com.java.class30;

class Demo{


    void sum(int a, int b){

    }

    void sum(int a, int b, int c){

    }

    void sum(int c, double d){

    }

    void sum(double c, int d){

    }

    void sum(double c, float d){

    }

    void sum(float c, double d){

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(10,20,40);
        d.sum(10,20);
        d.sum(10.4, 20);
        d.sum(10,20.5);
    }
}
