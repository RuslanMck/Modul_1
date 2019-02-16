package com.Ruslan.ALevel.coffeeHouse.coffeeRecipes;

public abstract class BaseCoffee {

    int sugarGram;
    int waterPortion;
    int coffeePortion;
    int cup;

    public BaseCoffee( int sugarGram, int waterPortion, int coffeePortion, int cup) {
        this.sugarGram = sugarGram;
        this.waterPortion = waterPortion;
        this.coffeePortion = coffeePortion;
        this.cup = cup;
    }
}
