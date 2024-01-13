package org.factory.abstractFactory.store;

import org.factory.abstractFactory.ingredients.ChicagoPizzaIngredientFactory;
import org.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import org.factory.abstractFactory.pizza.CheesePizza;
import org.factory.abstractFactory.pizza.ClamPizza;
import org.factory.abstractFactory.pizza.PepperoniPizza;
import org.factory.abstractFactory.pizza.Pizza;
import org.factory.abstractFactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch(type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "veggie":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
