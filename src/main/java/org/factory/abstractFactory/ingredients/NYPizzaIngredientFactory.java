package org.factory.abstractFactory.ingredients;

import org.factory.abstractFactory.ingredients.cheese.Cheese;
import org.factory.abstractFactory.ingredients.clams.Clams;
import org.factory.abstractFactory.ingredients.dough.Dough;
import org.factory.abstractFactory.ingredients.clams.FreshClams;
import org.factory.abstractFactory.ingredients.veggies.Garlic;
import org.factory.abstractFactory.ingredients.sauce.MarinaraSauce;
import org.factory.abstractFactory.ingredients.veggies.Mushroom;
import org.factory.abstractFactory.ingredients.veggies.Onion;
import org.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.factory.abstractFactory.ingredients.veggies.RedPepper;
import org.factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import org.factory.abstractFactory.ingredients.sauce.Sauce;
import org.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import org.factory.abstractFactory.ingredients.dough.ThinCrustDough;
import org.factory.abstractFactory.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
