package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

public class LiddedCup extends Cup {

    public LiddedCup(String liquid) {
        super(liquid);
    }

    public void sip() {
        System.out.println("Protecting your shirt.");
        super.sip();
    }
}