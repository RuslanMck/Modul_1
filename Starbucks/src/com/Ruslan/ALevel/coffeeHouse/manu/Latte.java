package com.Ruslan.ALevel.coffeeHouse.manu;

public class Latte extends BaseCoffee {

    int milkGram;

    public Latte(int sugarGram, int waterPortion, int coffeePortion, int cup, int milkGram) {
        super( sugarGram, waterPortion, coffeePortion, cup);
        this.milkGram = milkGram;
    }
}
