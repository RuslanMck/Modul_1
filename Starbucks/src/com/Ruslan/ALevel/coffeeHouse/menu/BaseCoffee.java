package com.Ruslan.ALevel.coffeeHouse.menu;

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

    public int getSugarGram() {
        return sugarGram;
    }

    public int getWaterPortion() {
        return waterPortion;
    }

    public int getCoffeePortion() {
        return coffeePortion;
    }

    public int getCup() {
        return cup;
    }
}
