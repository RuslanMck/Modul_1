package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.*;
import com.Ruslan.ALevel.coffeeHouse.coffeeRecipes.BaseCoffee;
import com.Ruslan.ALevel.randomizer.RandomBoolean;

public class CoffeeMachine implements CoffeeFactory {

    boolean isWork;

    LatteFactory latteFactory;
    AmericanoFactory americanoFactory;
    EspressoFactory espressoFactory;
    RandomBoolean randomBoolean = new RandomBoolean();

    public CoffeeMachine() {
        latteFactory = new LatteFactory(randomBoolean.generate());
        americanoFactory = new AmericanoFactory(randomBoolean.generate());
        espressoFactory = new EspressoFactory(randomBoolean.generate());
    }

    private boolean checkMachine(){
        return true;
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
