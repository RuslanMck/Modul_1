package com.Ruslan.ALevel.customExceptions;

public class NotEnoughIngredients extends Exception {
    public NotEnoughIngredients() {
        System.out.println("Sorry, but we out of ingredients for coffee. Starbucks is closing.");
        System.exit(1);
    }

    public NotEnoughIngredients(String message) {
        super(message);
    }
}
