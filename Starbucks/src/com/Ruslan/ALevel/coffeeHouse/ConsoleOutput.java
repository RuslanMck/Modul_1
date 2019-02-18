package com.Ruslan.ALevel.coffeeHouse;

import com.Ruslan.ALevel.client.Client;

public class ConsoleOutput {
    public void Welcome(Client client) {
        System.out.println("Barista: Welcome, " + client.getName() + "!");
    }

    public void BaristaServe(Client client) {
        System.out.println("Please, " + client.getName() + " here is your " + client.getCoffeeToBuy() + ".\n");
    }

    public void MachineServe(Client client) {
        System.out.println(client.getName() + " bought " + client.getCoffeeToBuy() + " from machine.\n");
    }
}