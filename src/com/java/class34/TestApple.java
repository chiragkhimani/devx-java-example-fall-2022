package com.java.class34;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.Arrays;

public class TestApple {

    public static void main(String[] args) {
        BaseIphone deviceId1 = new BaseIphone("Iphone7", 512, "Black", "16.0");
        BaseIphone deviceId2 = new BaseIphone("Iphone8", 256, "Silver", "14.0");
        BaseIphone deviceId3 = new BaseIphone("Iphone10", 156, "matte", "15.0");
        BaseIphone deviceId4 = new BaseIphone("Iphone8", 156, "Matte", "15.0");


        //Arrays with Object
        BaseIphone[] allIphones = new BaseIphone[4];
        allIphones[0] = deviceId1;
        allIphones[1] = deviceId2;
        allIphones[2] = deviceId3;
        allIphones[3] = deviceId4;


        updateIOS(allIphones);
        System.out.println(Arrays.toString(allIphones));
    }

    //create a static method that takes an array of all types of Iphones and finds all iphones
    //with an IOSversion that is not 16.0 and updates them to 16.0
    public static void updateIOS(BaseIphone[] baseIphones) {

        for (BaseIphone baseIphone : baseIphones) {
            if (!baseIphone.getiOSVersion().equalsIgnoreCase("16.0")) {
                baseIphone.setiOSVersion("16.0");
            }
        }
    }


        //=======>array
        //is collection that can store both primitive and non-primitive data types
        //it has a fixed size
        //it the fastest collection.
        int[] numbers = new int[3];

        String[] anyStrings = new String[4];

        BaseIphone[] iphones = new BaseIphone[100];
//        iphones[0] = new BaseIphone("Iphone8", 156, "Matte", "15.0");
//        iphones[1] = deviceId2;


    }






//        int deviceId1 = 1;
//        String modelId1 = "Iphone7";
//        int memoryInMgId1 = 512;
//        String colorId1 = "Black";
//        String iOSVersionId1 = "16.0";
//
//
//        int deviceId2 = 2;
//        String modelId2 = "Iphone8";
//        int memoryInMgId2 = 256;
//        String colorId2 = "Silver";
//        String iOSVersionId2 = "14.0";
//
//        int deviceId3 = 3;
//        String modelId3 = "Iphone10";
//        int memoryInMgId3 = 156;
//        String colorId3 = "Matte";
//        String iOSVersionId3 = "15.0";
//
//        int deviceId4 = 3;
//        String modelId4 = "Iphone8";
//        int memoryInMgId4 = 156;
//        String colorId4 = "Matte";
//        String iOSVersionId5 = "15.0";
//
//        //how would I print out all iphone info
//        System.out.println("deviceId: " + deviceId1 + " " + modelId1 + " memory " + memoryInMgId1 + " MB " + " color " + colorId1 + " Ios Version " + iOSVersionId1);
//        System.out.println("deviceId: " + deviceId2 + " " + modelId2 + " memory " + memoryInMgId2 + " MB " + " color " + colorId2 + " Ios Version " + iOSVersionId2);
//
//        int[] deviceIds = new int[4];
//        String[] modelIds = new String[4];
//        int[] memories = new int[4];
//        String[] colors = new String[4];
//        String[] iOSversions = new String[4];


////        Iphone7 aa = new Iphone7("Iphone 7", 532, "black");
//        System.out.println(aa.touchId("JJAA"));
//
//        System.out.println(whichIphone(aa));

//    }
//
//    //to take any Iphone object and return a model
//
//    //so this method should be able to take iphone7, phone8, iphone10
//    //and return a model.
////    public static String whichIphone(Iphone7 iphone){
////        return iphone.t
////
////    }

