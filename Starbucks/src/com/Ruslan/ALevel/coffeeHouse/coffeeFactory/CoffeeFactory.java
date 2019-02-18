package com.Ruslan.ALevel.coffeeHouse.coffeeFactory;

import com.Ruslan.ALevel.coffeeHouse.manu.BaseCoffee;

public interface CoffeeFactory {
    BaseCoffee createCoffee(CoffeeTypes coffeeType);
}