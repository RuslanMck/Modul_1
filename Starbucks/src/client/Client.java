package client;

import coffeeFarm.CoffeeTypes;

public abstract class Client {

    String name;
    int money;
    boolean isCash;
    CoffeeTypes coffeeToBuy;

    public Client(String name, int money, boolean isCash, CoffeeTypes coffeeToBuy) {
        this.name = name;
        this.money = money;
        this.isCash = isCash;
        this.coffeeToBuy = coffeeToBuy;
    }
}
