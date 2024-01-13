package org.factory.abstractFactory.pizza;

import org.factory.abstractFactory.ingredients.cheese.Cheese;
import org.factory.abstractFactory.ingredients.clams.Clams;
import org.factory.abstractFactory.ingredients.dough.Dough;
import org.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.factory.abstractFactory.ingredients.sauce.Sauce;
import org.factory.abstractFactory.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected final List<String> toppings = new ArrayList<>();

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", dough=" + dough + ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) + ", cheese=" + cheese + ", pepperoni=" + pepperoni +
                ", clams=" + clam + ", toppings=" + toppings + '}';
    }
}
