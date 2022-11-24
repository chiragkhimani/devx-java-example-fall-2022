package com.java.class30;

class Browser {
    void openIncognitoWindow() {
        System.out.println("Cntr + T");
    }
}

class Chrome extends Browser{
    void openIncognitoWindow() {
        System.out.println("Cntr + Shift + N");
    }
}

class FireFox extends Browser{
    void openIncognitoWindow() {
        System.out.println("Cntr + Shift + P");
    }
}
