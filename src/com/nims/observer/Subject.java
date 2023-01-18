package com.nims.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers =  new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObsever(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(int value){
        for (var observer:observers) {
            observer.update(value);
        }
    }
}
