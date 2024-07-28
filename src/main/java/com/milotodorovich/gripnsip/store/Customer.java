package com.milotodorovich.gripnsip.store;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void enjoy(Drink d) {
        System.out.println(this.name + " is enjoying their drink.");
        d.grip();
        d.sip();
        System.out.println(this.name + " is satisfied.");

    }
}