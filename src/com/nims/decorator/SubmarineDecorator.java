package com.nims.decorator;

public abstract class SubmarineDecorator implements Submarine {
    protected Submarine submarine;

    protected SubmarineDecorator(Submarine newPizza) {
        submarine = newPizza;
    }
    public String getIngredients(){
        return submarine.getIngredients();
    }
    public Double getCost(){
        return submarine.getCost();
    }
}
