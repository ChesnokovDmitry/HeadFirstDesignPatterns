package org.factory.methodFactory;

import org.factory.methodFactory.pizza.Pizza;
import org.factory.methodFactory.store.ChicagoPizzaStore;
import org.factory.methodFactory.store.NYPizzaStore;
import org.factory.methodFactory.store.PizzaStore;

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
