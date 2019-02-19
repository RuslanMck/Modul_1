package com.Ruslan.ALevel.coffeeHouse;

import com.Ruslan.ALevel.client.Client;

public class ConsoleOutput {
    public void welcome(Client client) {
        System.out.println("Barista: Welcome, " + client.getName() + "!");
    }

    public void baristaServe(Client client) {
        System.out.println("Please, " + client.getName() + " here is your " + client.getCoffeeToBuy() + ".\n");
    }

    public void machineServe(Client client) {
        System.out.println(client.getName() + " bought " + client.getCoffeeToBuy() + " from machine.\n");
    }

    public void lackOfMoney(Client client){
        System.out.println("I'm sorry, " + client.getName() + ", but you don't have enough money to bay " + client.getCoffeeToBuy() + ".\n");
    }

    public void paymentError(){
        System.out.println("Error, not enough money on your credit card.\n");
    }
}