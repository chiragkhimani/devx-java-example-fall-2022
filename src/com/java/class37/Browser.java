package com.java.class37;

public interface Browser {
    // By default variables are public static final
    int balance = 100;

    // By default methods are public and abstract
    void closeBrowser();

    void openIncognito();
}

interface WebBrowser extends Browser {
    void fullScreen();
}

interface MobileBrowser extends Browser {
    void supportRotation();
}

class Chrome implements WebBrowser, MobileBrowser {
    public void closeBrowser() {

    }

    public void openIncognito() {
        System.out.println("CNTR + Shift + T");
    }

    public void fullScreen() {

    }

    public void supportRotation() {

    }
}

class FireFox implements Browser {
    public void closeBrowser() {

    }

    public void openIncognito() {
        System.out.println("CNTR + Shift + T");
    }
}

