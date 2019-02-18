package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.ConsoleOutput;
import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.*;
import com.Ruslan.ALevel.coffeeHouse.manu.BaseCoffee;
import com.Ruslan.ALevel.coffeeHouse.manu.CoffeePrice;
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
                return latteFactory.createLatte();
            case Americano:
                return americanoFactory.createAmericano();
            case Espresso:
                return espressoFactory.createEspresso();
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