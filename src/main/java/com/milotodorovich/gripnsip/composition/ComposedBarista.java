package com.milotodorovich.gripnsip.composition;

import com.milotodorovich.gripnsip.store.Barista;
import com.milotodorovich.gripnsip.store.Barista.OrderType;
import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;
import com.milotodorovich.gripnsip.composition.SleevedDrink;
import com.milotodorovich.gripnsip.composition.LiddedDrink;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.List;

public class ComposedBarista implements Barista {

    public ComposedBarista() {};

    public Drink processOrder(String liquid, OrderType... types) {
        List<OrderType> ots = Arrays.asList(types);
        Drink d = new Cup(liquid);
        if (ots.contains(OrderType.HOT)) {
            d = new SleevedDrink(d);
        }
        if (ots.contains(OrderType.FAST)) {
            d = new LiddedDrink(d);
        }
        return d;
    }
}