package com.nims;

public class Main {
    public static void main(String[] args) {
        // loose coupling
        TaxCalculator calculator = new TaxCalculator1();
        // encapsulation
        Account account = new Account();
        account.deposit(20);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
    }
