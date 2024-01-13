package org.factory.abstractFactory.store;

import org.factory.abstractFactory.ingredients.NYPizzaIngredientFactory;
import org.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import org.factory.abstractFactory.pizza.CheesePizza;
import org.factory.abstractFactory.pizza.ClamPizza;
import org.factory.abstractFactory.pizza.Pizza;
import org.factory.abstractFactory.pizza.VeggiePizza;
import org.factory.abstractFactory.pizza.PepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch(type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
