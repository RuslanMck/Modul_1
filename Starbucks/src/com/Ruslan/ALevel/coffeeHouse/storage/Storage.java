package com.Ruslan.ALevel.coffeeHouse.storage;

import com.Ruslan.ALevel.coffeeHouse.menu.BaseCoffee;
import com.Ruslan.ALevel.coffeeHouse.menu.Latte;

public class Storage {
    int sugar;
    int water;
    int milk;
    int cups;
    int coffee;
    int result;

    public Storage(int sugar, int water, int milk, int cups, int coffee) {
        this.sugar = sugar;
        this.water = water;
        this.milk = milk;
        this.cups = cups;
        this.coffee = coffee;
    }

    public int takeSugar(BaseCoffee coffee){
        result = getSugar() - coffee.getSugarGram();
        if (result >= 0) setSugar(result);
        return result;
    }

    public int takeWater(BaseCoffee coffee){
        result = getWater() - coffee.getWaterPortion();
        if (result >= 0) setWater(result);
        return result;
    }

    public int takeCoffee(BaseCoffee coffee){
        result = getCoffee() - coffee.getCoffeePortion();
        if (result >= 0) setCoffee(result);
        return result;
    }

    public int takeMilk(Latte latte){
        result = getMilk() - latte.getMilkGram();
        if (result >= 0) setMilk(result);
        return result;
    }

    public int takeCup(BaseCoffee coffee){
        result = getCups() - coffee.getCup();
        if (result >= 0) setCups(result);
        return result;
    }

    public int getSugar() {
        return sugar;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCups() {
        return cups;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
}
