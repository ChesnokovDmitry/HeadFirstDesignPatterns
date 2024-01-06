package org.factory.simpleFactory;

import org.factory.simpleFactory.pizza.CheesePizza;
import org.factory.simpleFactory.pizza.ClamPizza;
import org.factory.simpleFactory.pizza.PepperoniPizza;
import org.factory.simpleFactory.pizza.Pizza;
import org.factory.simpleFactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch(type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
