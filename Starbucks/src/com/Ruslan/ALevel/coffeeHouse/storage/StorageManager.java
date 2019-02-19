package com.Ruslan.ALevel.coffeeHouse.storage;

import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.CoffeeTypes;
import com.Ruslan.ALevel.coffeeHouse.menu.BaseCoffee;
import com.Ruslan.ALevel.coffeeHouse.menu.Latte;
import com.Ruslan.ALevel.customExceptions.NotEnoughIngredients;

public class StorageManager {

    Storage storage = new Storage(500,900,500,500,500);

    public void takeIngredient(CoffeeTypes coffeeType, BaseCoffee baseCoffee) throws NotEnoughIngredients {
        switch (coffeeType) {
            case Latte:
                int sugar = storage.takeSugar(baseCoffee);
                int water = storage.takeWater(baseCoffee);
                int coffee = storage.takeCoffee(baseCoffee);
                int milk = storage.takeMilk((Latte) baseCoffee);
                int cup = storage.takeCup(baseCoffee);
                if (sugar <= 0 || water <= 0 || coffee <= 0 || milk <= 0 || cup <= 0){
                    throw new NotEnoughIngredients();
                }
                break;
            case Americano:
                sugar = storage.takeSugar(baseCoffee);
                water = storage.takeWater(baseCoffee);
                coffee = storage.takeCoffee(baseCoffee);
                cup = storage.takeCup(baseCoffee);
                if (sugar <= 0 || water <= 0 || coffee <= 0 || cup <= 0){
                    throw new NotEnoughIngredients();
                }
                break;
            case Espresso:
                sugar = storage.takeSugar(baseCoffee);
                water = storage.takeWater(baseCoffee);
                coffee = storage.takeCoffee(baseCoffee);
                cup = storage.takeCup(baseCoffee);
                if (sugar <= 0 || water <= 0 || coffee <= 0 || cup <= 0){
                    throw new NotEnoughIngredients();
                }
                break;
        }
    }
}
