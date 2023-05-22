package com.nims.decorator;

public class ChickenSubmarine extends SubmarineDecorator {
    protected ChickenSubmarine(Submarine newSubmarine) {
        super(newSubmarine);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Chicken";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.00;
    }
}
