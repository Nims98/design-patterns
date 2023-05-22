package com.nims.decorator;

public class BaseSubmarine implements Submarine {
    @Override
    public String getIngredients() {
        return "Base Submarine";
    }

    @Override
    public Double getCost() {
        return 2.00;
    }
}
