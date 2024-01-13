package org.factory.abstractFactory;

import org.factory.abstractFactory.pizza.Pizza;
import org.factory.abstractFactory.store.ChicagoPizzaStore;
import org.factory.abstractFactory.store.NYPizzaStore;
import org.factory.abstractFactory.store.PizzaStore;

public class OrderPizza {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
