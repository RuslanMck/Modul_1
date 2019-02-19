package com.Ruslan.ALevel.coffeeHouse.coffeeFactory;

import com.Ruslan.ALevel.coffeeHouse.menu.BaseCoffee;

public interface CoffeeFactory {
    BaseCoffee createCoffee(CoffeeTypes coffeeType);
}