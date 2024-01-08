package org.factory.methodFactory.store;

import org.factory.methodFactory.pizza.ChicagoStyleCheesePizza;
import org.factory.methodFactory.pizza.ChicagoStyleClamPizza;
import org.factory.methodFactory.pizza.ChicagoStylePepperoniPizza;
import org.factory.methodFactory.pizza.ChicagoStyleVeggiePizza;
import org.factory.methodFactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
