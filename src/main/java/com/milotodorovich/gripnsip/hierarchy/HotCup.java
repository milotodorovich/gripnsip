package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

public class HotCup extends Cup {

    public HotCup(String liquid) {
        super(liquid);
    }

    public void grip() {
        System.out.println("Protecting your hands.");
        super.grip();
    }
}