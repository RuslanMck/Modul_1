package com.Ruslan.ALevel.coffeeHouse.manu;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.CoffeeTypes;

public class CoffeePrice {

    public int getPrice(CoffeeTypes coffeeTypes){
        switch (coffeeTypes) {
            case Latte:
                return 40;
            case Americano:
                return 25;
            case Espresso:
                return 50;
        }
        return 0;
    }
}
