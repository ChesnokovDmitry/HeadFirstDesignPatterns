package org.factory.abstractFactory.ingredients;

import org.factory.abstractFactory.ingredients.cheese.Cheese;
import org.factory.abstractFactory.ingredients.cheese.MozzarellaCheese;
import org.factory.abstractFactory.ingredients.clams.Clams;
import org.factory.abstractFactory.ingredients.clams.FrozenClams;
import org.factory.abstractFactory.ingredients.dough.Dough;
import org.factory.abstractFactory.ingredients.dough.ThickCrustDough;
import org.factory.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import org.factory.abstractFactory.ingredients.veggies.BlackOlives;
import org.factory.abstractFactory.ingredients.veggies.EggPlant;
import org.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.factory.abstractFactory.ingredients.sauce.Sauce;
import org.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import org.factory.abstractFactory.ingredients.veggies.Spinach;
import org.factory.abstractFactory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new Spinach(), new EggPlant() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
