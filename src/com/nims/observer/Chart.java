package com.nims.observer;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("chart updated : "+value);
    }
}
