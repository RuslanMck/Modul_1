package com.Ruslan.ALevel.coffeeHouse;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.client.ClientCreator;
import com.Ruslan.ALevel.coffeeHouse.staff.Barista;
import com.Ruslan.ALevel.coffeeHouse.staff.CoffeeMachine;

import java.util.Random;

public class CoffeeHouse {

    ClientCreator clientCreator = new ClientCreator();
    Barista barista = new Barista();
    CoffeeMachine coffeeMachine = new CoffeeMachine();

    Client[] clients = clientCreator.createClients(10);


    public void serveCustomers(){

        Random random = new Random();

        for (int i = 0; i < clients.length; i++){
            int rnd = random.nextInt(2);
            if (rnd == 0){
                barista.createCoffee(clients[i].getCoffeeToBuy());
                System.out.println("Client " + clients[i].getName() + " bought " + clients[i].getCoffeeToBuy() + " from barista.");
            } else {
                coffeeMachine.createCoffee(clients[i].getCoffeeToBuy());
                System.out.println("Client " + clients[i].getName() + " bought " + clients[i].getCoffeeToBuy() + " from coffee machine.");
            }
        }
    }
}