package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.ConsoleOutput;
import com.Ruslan.ALevel.coffeeHouse.coffeeFactory.*;
import com.Ruslan.ALevel.coffeeHouse.manu.BaseCoffee;
import com.Ruslan.ALevel.coffeeHouse.manu.CoffeePrice;
import com.Ruslan.ALevel.randomizer.RandomBoolean;

public class Barista implements CoffeeFactory, PaymentActions, ServiceActions {

    boolean isPayed;

    LatteFactory latteFactory;
    AmericanoFactory americanoFactory;
    EspressoFactory espressoFactory;
    RandomBoolean randomBoolean = new RandomBoolean();
    PaymentTerminal terminal = new PaymentTerminal();
    ConsoleOutput output = new ConsoleOutput();

    public Barista() {
        latteFactory = new LatteFactory(randomBoolean.generate());
        americanoFactory = new AmericanoFactory(randomBoolean.generate());
        espressoFactory = new EspressoFactory(randomBoolean.generate());
    }
    @Override
    public void payment(Client client, CoffeePrice price, PaymentCallback callback) {
        if (!client.isCash()) callback.paymentDone(terminal.payment(client, price));
        else callback.paymentDone(getCash(client,price));
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

    public boolean getCash(Client client, CoffeePrice price) {
        if (client.getMoney() >= price.getPrice(client.getCoffeeToBuy())) {
            int change = client.getMoney() - price.getPrice(client.getCoffeeToBuy());
            if (change > 0) {
                System.out.println("Take your change, pleas. Its " + change + ".");
            }
            isPayed = true;
        } else isPayed = false;
        return isPayed;
    }

    @Override
    public void serveCustomers(Client client, CoffeePrice price) {
        terminal.payment(client, price, (p -> isPayed = p));
        if (!isPayed){
            output.lackOfMoney(client);
        } else {
            createCoffee(client.getCoffeeToBuy());
            output.baristaServe(client);
        }
    }
}
