package org.factory.abstractFactory.ingredients;

import org.factory.abstractFactory.ingredients.cheese.Cheese;
import org.factory.abstractFactory.ingredients.clams.Clams;
import org.factory.abstractFactory.ingredients.dough.Dough;
import org.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.factory.abstractFactory.ingredients.sauce.Sauce;
import org.factory.abstractFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
