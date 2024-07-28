package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

public class Barista {

    public Barista() {}

    public Drink processOrder(String liquid) {
        Drink d = new Cup(liquid);
        return d;
    }
}