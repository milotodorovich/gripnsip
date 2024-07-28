package com.milotodorovich.gripnsip.hierarchy;

import com.milotodorovich.gripnsip.store.Barista;
import com.milotodorovich.gripnsip.store.Barista.OrderType;
import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;
import com.milotodorovich.gripnsip.hierarchy.HotCup;
import com.milotodorovich.gripnsip.hierarchy.HotLiddedCup;
import com.milotodorovich.gripnsip.hierarchy.LiddedCup;
import java.util.Arrays;
import java.util.List;

public class HierarchicalBarista implements Barista {

    public HierarchicalBarista() {}

    public Drink processOrder(String liquid, OrderType... types) {
        List<OrderType> ots = Arrays.asList(types);
        Drink d;
        if (ots.contains(OrderType.HOT) && ots.contains(OrderType.FAST)) {
            d = new HotLiddedCup(liquid);
        } else if (ots.contains(OrderType.HOT)) {
            d = new HotCup(liquid);
        } else if (ots.contains(OrderType.FAST)) {
            d = new LiddedCup(liquid);
        } else {
            d = new Cup(liquid);
        }
        return d;
    }
}