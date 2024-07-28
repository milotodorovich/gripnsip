package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

public class Barista {

    public Barista() {}

    public enum OrderType {
        HOT,
        FAST;
    }

    public Drink processOrder(String liquid, OrderType... types) {
        Drink d = new Cup(liquid);
        return d;
    }
}