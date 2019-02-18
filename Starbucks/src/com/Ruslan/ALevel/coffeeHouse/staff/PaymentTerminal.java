package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.manu.CoffeePrice;

public class PaymentTerminal implements PaymentActions {

    @Override
    public void payment(Client client, CoffeePrice price, PaymentCallback callback) {
        if (client.getMoney() >= price.getPrice(client.getCoffeeToBuy())) callback.paymentDone(true);
        else  callback.paymentDone(false);

    }
}
