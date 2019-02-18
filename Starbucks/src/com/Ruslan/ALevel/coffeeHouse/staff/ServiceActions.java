package com.Ruslan.ALevel.coffeeHouse.staff;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.coffeeHouse.manu.CoffeePrice;

public interface ServiceActions {
    void serveCustomers(Client client, CoffeePrice price);
}
