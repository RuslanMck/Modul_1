package com.Ruslan.ALevel.client.clientFactory;

import com.Ruslan.ALevel.client.Client;
import com.Ruslan.ALevel.randomizer.BoundedRandomInt;
import com.Ruslan.ALevel.randomizer.RandomBoolean;
import com.Ruslan.ALevel.randomizer.RandomCoffee;
import com.Ruslan.ALevel.randomizer.RandomName;


public class ClientFactory {

    RandomBoolean randomBoolean = new RandomBoolean();
    RandomName randomName = new RandomName();
    BoundedRandomInt randomInt = new BoundedRandomInt();
    RandomCoffee randomCoffee = new RandomCoffee();

    public Client createClient(){
        return new Client(randomName.setRandomName(), randomInt.generate(20,100),randomBoolean.generate(), randomCoffee.getRandomCoffeeType());
    }
}
