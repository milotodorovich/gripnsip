package com.milotodorovich.gripnsip.store;

public class Cup implements Drink {

    private String liquid;

    public Cup(String liquid) {
        System.out.println("Pouring your new: " + liquid);
        this.liquid = liquid;
    }

    public void grip() {
        System.out.println("Hold on to your: " + this.liquid);
    }

    public void sip() {
        System.out.println("Enjoy your: " + this.liquid);
    }

}