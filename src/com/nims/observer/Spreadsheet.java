package com.nims.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update() {
        System.out.println("spreadsheet updated");
    }
}
