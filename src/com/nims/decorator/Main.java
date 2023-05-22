package com.nims.decorator;

public class Main {
    public static void main(String[] args) {
        Submarine pizza =  new BaseSubmarine();
        Submarine cheesePizza = new CheeseSubmarine(pizza);
        Submarine saucePizza = new ChickenSubmarine(cheesePizza);

        System.out.println(saucePizza.getIngredients());
        System.out.println(saucePizza.getCost());
    }
}
