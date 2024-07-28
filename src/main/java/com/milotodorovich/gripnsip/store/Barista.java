package com.milotodorovich.gripnsip.store;

public interface Barista {

    public enum OrderType {
        HOT,
        FAST;
    }

    public Drink processOrder(String liquid, OrderType... types);
}