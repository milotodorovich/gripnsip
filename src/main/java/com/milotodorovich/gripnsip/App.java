package com.milotodorovich.gripnsip;

import com.milotodorovich.gripnsip.hierarchy.HierarchicalBarista;
import com.milotodorovich.gripnsip.store.Barista;
import com.milotodorovich.gripnsip.store.Barista.OrderType;
import com.milotodorovich.gripnsip.store.Customer;
import com.milotodorovich.gripnsip.store.Cup;
import com.milotodorovich.gripnsip.store.Drink;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        simulateHierarchy();
    }

    public static void simulateHierarchy() {
        Customer c;
        Barista b = new HierarchicalBarista();

        Drink d = b.processOrder("coffee");
         c = new Customer("Daniel");
        c.enjoy(d);

        Drink liddedDrink = b.processOrder("iced tea", OrderType.FAST);
        c = new Customer("Speedy");
        c.enjoy(liddedDrink);

        Drink hotDrink = b.processOrder("boiled tea", OrderType.HOT);
        c = new Customer("Sniffly");
        c.enjoy(hotDrink);

        Drink hotLiddedDrink = b.processOrder("extra-hot coffee", OrderType.HOT, OrderType.FAST);
        c = new Customer("Wired");
        c.enjoy(hotLiddedDrink);
    }
}
