package com.Ruslan.ALevel.randomizer;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.CoffeeTypes;

import java.util.Random;

public class RandomCoffee {

    CoffeeTypes[] coffee = new CoffeeTypes[]{CoffeeTypes.Americano, CoffeeTypes.Espresso, CoffeeTypes.Latte};

    public CoffeeTypes getRandomCoffeeType() {
        Random random = new Random();
        int rnd = random.nextInt(coffee.length);
        return coffee[rnd];
    }
}
