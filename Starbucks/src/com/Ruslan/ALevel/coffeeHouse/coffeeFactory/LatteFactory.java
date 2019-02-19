package com.Ruslan.ALevel.coffeeHouse.coffeeFactory;

import com.Ruslan.ALevel.coffeeHouse.menu.Latte;

public class LatteFactory {

    boolean withSugar;

    public LatteFactory(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public Latte createLatte() {
        if (withSugar) return new Latte(3, 200, 30, 1, 15);
        else return new Latte(0, 200, 30, 1, 15);
    }
}
