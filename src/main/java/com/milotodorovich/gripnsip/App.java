package com.milotodorovich.gripnsip;

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
        Drink d = new Cup("coffee");
        Customer c = new Customer("Daniel");
        c.enjoy(d);
    }
}
