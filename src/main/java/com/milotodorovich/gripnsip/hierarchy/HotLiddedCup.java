package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

public class HotLiddedCup extends Cup {

    public HotLiddedCup(String liquid) {
        super(liquid);
    }

    public void grip() {
        System.out.println("Protecting your hands.");
        super.grip();
    }

    public void sip() {
        System.out.println("Protecting your shirt.");
        super.sip();
    }
}