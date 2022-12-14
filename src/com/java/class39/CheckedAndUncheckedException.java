package com.java.class39;

import java.io.File;
import java.io.FileInputStream;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream(new File(""));
        } catch (Exception e) {

        }

    }
}
