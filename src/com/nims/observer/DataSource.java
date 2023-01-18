package com.nims.observer;

public class DataSource extends Subject {
    private int value;
    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }


}
