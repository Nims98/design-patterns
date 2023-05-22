package com.nims.decorator;

public class CheeseSubmarine extends SubmarineDecorator {
    protected CheeseSubmarine(Submarine newSubmarine) {
        super(newSubmarine);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Cheese";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.00;
    }
}
