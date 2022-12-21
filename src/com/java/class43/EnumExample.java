package com.java.class43;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum InputField {
    AMOUNT,
    FROM_ACCOUNT,
    TO_ACCOUNT,
    NOTE;
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("Opening a Bank website");
        Map<String, String> dataOnInput = enterDetailsAndClickOnContinue();
        Map<String, String> dataOnReview = getDataOnReviewPage();

        Set<String> keys = dataOnInput.keySet();

        for (String key : keys) {
            System.out.println(dataOnInput.get(key));
            System.out.println(dataOnReview.get(key));
            System.out.println(dataOnInput.get(key).equals(dataOnReview.get(key)));
        }

    }

    public static Map<String, String> getDataOnReviewPage() {
        String fromAcc = "453-234-457-343";
        String toAcc = "3453-34545-234354";
        Integer amount = 2000;
        String note = "Salary Payment";

        Map<String, String> dataOnReviewPage = new HashMap<>();

        dataOnReviewPage.put(InputField.FROM_ACCOUNT.toString(), fromAcc);
        dataOnReviewPage.put(InputField.TO_ACCOUNT.toString(), toAcc);
        dataOnReviewPage.put(InputField.AMOUNT.toString(), amount.toString());
        dataOnReviewPage.put(InputField.NOTE.toString(), note);
        return dataOnReviewPage;
    }

    public static Map<String, String> enterDetailsAndClickOnContinue() {
        String fromAcc = "453-234-457-343";
        String toAcc = "3453-34545-234354";
        Integer amount = 2000;
        String note = "Salary Payment";

        System.out.println("Entering from account " + fromAcc);
        System.out.println("Entering to account " + toAcc);
        System.out.println("Entering amount " + amount);
        System.out.println("Entering note " + note);
        System.out.println("Continue Button");

        Map<String, String> dataOnInput = new HashMap<>();
        dataOnInput.put(InputField.FROM_ACCOUNT.toString(), fromAcc);
        dataOnInput.put(InputField.TO_ACCOUNT.toString(), toAcc);
        dataOnInput.put(InputField.AMOUNT.toString(), amount.toString());
        dataOnInput.put(InputField.NOTE.toString(), note);
        return dataOnInput;
    }
}
