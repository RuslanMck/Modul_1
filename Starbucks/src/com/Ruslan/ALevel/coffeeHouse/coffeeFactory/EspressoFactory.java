package com.Ruslan.ALevel.coffeeHouse.coffeeFactory;

import com.Ruslan.ALevel.coffeeHouse.menu.Espresso;

public class EspressoFactory {
    boolean withSugar;

    public EspressoFactory(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public Espresso createEspresso(){
        if (withSugar) return new Espresso(3,100,30,1);
        else return new Espresso(0,100,30,1);
    }
}