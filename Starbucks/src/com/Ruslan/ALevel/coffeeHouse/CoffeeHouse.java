package com.Ruslan.ALevel.coffeeHouse;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.client.ClientCreator;
import com.Ruslan.ALevel.coffeeHouse.staff.Barista;
import com.Ruslan.ALevel.coffeeHouse.staff.CoffeeMachine;

import java.util.Random;

public class CoffeeHouse {

    ConsoleOutput output = new ConsoleOutput();
    ClientCreator clientCreator = new ClientCreator();
    Barista barista = new Barista();
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    Client[] clients = clientCreator.createClients(10);

    public void serveCustomers() {

        Random random = new Random();

        for (int i = 0; i < clients.length; i++){
            int rnd = random.nextInt(2);
            output.Welcome(clients[i]);
            if (rnd == 0 && !coffeeMachine.checkMachine()){
                coffeeMachine.createCoffee(clients[i].getCoffeeToBuy());
                output.MachineServe(clients[i]);
            }
            else {
                barista.createCoffee(clients[i].getCoffeeToBuy());
                output.BaristaServe(clients[i]);
            }
        }
    }
}