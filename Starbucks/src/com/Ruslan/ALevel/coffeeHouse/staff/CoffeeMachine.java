package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.*;
import com.Ruslan.ALevel.coffeeHouse.coffeeRecipes.BaseCoffee;
import com.Ruslan.ALevel.randomizer.RandomBoolean;

import java.util.Random;

public class CoffeeMachine implements CoffeeFactory {

    boolean isBroke;

    LatteFactory latteFactory;
    AmericanoFactory americanoFactory;
    EspressoFactory espressoFactory;
    RandomBoolean randomBoolean = new RandomBoolean();

    public CoffeeMachine() {
        latteFactory = new LatteFactory(randomBoolean.generate());
        americanoFactory = new AmericanoFactory(randomBoolean.generate());
        espressoFactory = new EspressoFactory(randomBoolean.generate());
    }

    public boolean checkMachine() {
        Random random = new Random();
        int rnd = random.nextInt(100);
        if (rnd > 80) {
            System.out.println("Sorry, coffee machine has broke. (" + rnd + " error).");
            isBroke = true;
        } else isBroke = false;
        return isBroke;
    }

    @Override
    public BaseCoffee createCoffee(CoffeeTypes coffeeType) {
        switch (coffeeType) {
            case Latte:
                return latteFactory.createLatte();
            case Americano:
                return americanoFactory.createAmericano();
            case Espresso:
                return espressoFactory.createEspresso();
        }
        return null;
    }
}