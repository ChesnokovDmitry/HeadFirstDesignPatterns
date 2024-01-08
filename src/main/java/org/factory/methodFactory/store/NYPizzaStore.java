package org.factory.methodFactory.store;

import org.factory.methodFactory.pizza.NYStyleCheesePizza;
import org.factory.methodFactory.pizza.NYStyleClamPizza;
import org.factory.methodFactory.pizza.NYStylePepperoniPizza;
import org.factory.methodFactory.pizza.NYStyleVeggiePizza;
import org.factory.methodFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "clam":
                return new NYStyleClamPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
        }
        return null;
    }
}
