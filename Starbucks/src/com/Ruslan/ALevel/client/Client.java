package com.Ruslan.ALevel.client;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.CoffeeTypes;

public class Client {

    String name;
    int money;
    boolean isCash;
    CoffeeTypes coffeeToBuy;

    public Client(String name, int money, boolean isCash, CoffeeTypes coffeeToBuy) {
        this.name = name;
        this.money = money;
        this.isCash = isCash;
        this.coffeeToBuy = coffeeToBuy;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public boolean isCash() {
        return isCash;
    }

    public CoffeeTypes getCoffeeToBuy() {
        return coffeeToBuy;
    }
}