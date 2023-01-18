package com.nims.observer;

public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("chart updated");
    }
}
