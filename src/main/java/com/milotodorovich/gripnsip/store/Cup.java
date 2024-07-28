package com.milotodorovich.gripnsip.store;

public class Cup implements Drink {

    private String liquid;

    public Cup(String liquid) {
        System.out.println("Pouring your new " + liquid);
        this.liquid = liquid;
    }

    public void grip() {
        System.out.println("Gripping " + this.liquid);
    }

    public void sip() {
        System.out.println("Sipping " + this.liquid);
    }

}