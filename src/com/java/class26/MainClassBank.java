package com.java.class26;

public class MainClassBank {
    public static void main(String[] args) {
        Bank acc1 = new Bank("Chirag", 4000);
        Bank acc2 = new Bank("Maria", 5000);
        Bank acc3 = new Bank("Karina", 2000);

        Bank acc4 = new Bank();
        Bank acc5 = new Bank();
        Bank acc6 = new Bank();
        Bank acc7 = new Bank();


        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);
    }
}
