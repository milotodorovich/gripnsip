package com.milotodorovich.gripnsip;

import com.milotodorovich.gripnsip.composition.ComposedBarista;
import com.milotodorovich.gripnsip.composition.SleevedDrink;
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
        System.out.println( "STARTING HIERARCHICAL SIMULATION:" );
        simulateHierarchy();
        System.out.println( "STARTING COMPOSED SIMULATION:" );
        simulateComposition();
    }

    public static void simulateHierarchy() {
        Barista b = new HierarchicalBarista();
        simulate(b);
    }

    public static void simulateComposition() {
        Barista b = new ComposedBarista();
        simulate(b);

        System.out.println("COMPOSITION ALLOWS MORE OPTIONS!");
        Customer c = new Customer("Quite Picky");
        Drink hotLiddedDrink = b.processOrder("extra-hot coffee", OrderType.HOT, OrderType.FAST);
        c.enjoy(hotLiddedDrink);
        System.out.println("...and if it's still too hot...");
        hotLiddedDrink = new SleevedDrink(hotLiddedDrink);
        c.enjoy(hotLiddedDrink);
        System.out.println("Just right!");

    }

    public static void simulate(Barista b) {
        Customer c;
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
