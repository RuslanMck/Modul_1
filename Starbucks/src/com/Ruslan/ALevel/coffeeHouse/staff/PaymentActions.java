package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.manu.BaseCoffee;
import com.Ruslan.ALevel.coffeeHouse.manu.CoffeePrice;

public interface PaymentActions {
    void payment(Client client, CoffeePrice price, PaymentCallback callback);
    default boolean payment(Client client, CoffeePrice price){
        if (client.getMoney() >= price.getPrice(client.getCoffeeToBuy())) return true;
        else  return false;
    }

    interface PaymentCallback {
        void paymentDone(boolean isPayed);
    }
}
