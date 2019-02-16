package com.Ruslan.ALevel.coffeeHouse.coffeeFactory;

import com.Ruslan.ALevel.coffeeHouse.coffeeRecipes.Americano;

public class AmericanoFactory {

    boolean withSugar;

    public AmericanoFactory(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public Americano createAmericano(){
        if (withSugar)return new Americano(3,200,30,1);
        else return new Americano(0,200,30,1);
    }
}
