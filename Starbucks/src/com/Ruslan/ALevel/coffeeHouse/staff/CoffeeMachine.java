package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.ConsoleOutput;
import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.*;
import com.Ruslan.ALevel.coffeeHouse.menu.*;
import com.Ruslan.ALevel.coffeeHouse.storage.StorageManager;
import com.Ruslan.ALevel.customExceptions.NotEnoughIngredients;
import com.Ruslan.ALevel.randomizer.RandomBoolean;

import java.util.Random;

public class CoffeeMachine implements CoffeeFactory, ServiceActions {

    boolean isBroke;
    boolean isPayed;

    LatteFactory latteFactory;
    AmericanoFactory americanoFactory;
    EspressoFactory espressoFactory;
    RandomBoolean randomBoolean = new RandomBoolean();
    PaymentTerminal terminal = new PaymentTerminal();
    ConsoleOutput output = new ConsoleOutput();
    StorageManager storageManager = new StorageManager();


    public CoffeeMachine() {
        latteFactory = new LatteFactory(randomBoolean.generate());
        americanoFactory = new AmericanoFactory(randomBoolean.generate());
        espressoFactory = new EspressoFactory(randomBoolean.generate());
    }

    public boolean checkMachine() {
        Random random = new Random();
        int rnd = random.nextInt(100);
        if (rnd > 80) {
            System.out.println("Sorry, coffee machine has broke. (" + rnd + " error). Please, contact barista.");
            isBroke = true;
        } else isBroke = false;
        return isBroke;
    }

    @Override
    public BaseCoffee createCoffee(CoffeeTypes coffeeType) {
        switch (coffeeType) {
            case Latte:
                Latte latte = latteFactory.createLatte();
                try {
                    storageManager.takeIngredient(coffeeType,latte);
                } catch (NotEnoughIngredients notEnoughIngredients) {
                    notEnoughIngredients.getMessage();
                }
                return latte;
            case Americano:
                Americano americano = americanoFactory.createAmericano();
                try {
                    storageManager.takeIngredient(coffeeType,americano);
                } catch (NotEnoughIngredients notEnoughIngredients) {
                    notEnoughIngredients.getMessage();
                }
                return americano;
            case Espresso:
                Espresso espresso = espressoFactory.createEspresso();
                try {
                    storageManager.takeIngredient(coffeeType,espresso);
                } catch (NotEnoughIngredients notEnoughIngredients) {
                    notEnoughIngredients.getMessage();
                }
                return espresso;
        }
        return null;
    }
    @Override
    public void serveCustomers(Client client, CoffeePrice price) {
        terminal.payment(client, price, (p -> isPayed = p));
        if (!isPayed){
            output.paymentError();
        } else {
            createCoffee(client.getCoffeeToBuy());
            output.machineServe(client);
        }
    }
}