package com.Ruslan.ALevel.coffeeHouse.menu;

public class Latte extends BaseCoffee {

    int milkGram;

    public Latte(int sugarGram, int waterPortion, int coffeePortion, int cup, int milkGram) {
        super( sugarGram, waterPortion, coffeePortion, cup);
        this.milkGram = milkGram;
    }

    public int getMilkGram() {
        return milkGram;
    }
}
