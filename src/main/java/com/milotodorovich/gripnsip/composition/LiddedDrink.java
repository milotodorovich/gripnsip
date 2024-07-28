package com.milotodorovich.gripnsip.composition;

import com.milotodorovich.gripnsip.store.Drink;

public class LiddedDrink implements Drink {

    private Drink drink;

    public LiddedDrink(Drink d) {
        this.drink = d;
    }

    public void grip() {
        this.drink.grip();
    }

    public void sip() {
        System.out.println("Protecting your shirt.");
        this.drink.sip();
    }
}