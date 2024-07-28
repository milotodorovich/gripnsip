package com.milotodorovich.gripnsip.composition;

import com.milotodorovich.gripnsip.store.Drink;

public class SleevedDrink implements Drink {

    private Drink drink;

    public SleevedDrink(Drink d) {
        this.drink = d;
    }

    public void grip() {
        System.out.println("Protecting your hands.");
        this.drink.grip();
    }

    public void sip() {
        this.drink.sip();
    }
}