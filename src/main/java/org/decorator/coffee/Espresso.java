package org.decorator.coffee;

import org.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        double cost = 0.0;

        switch(size) {
            case SMALL:
                cost = 1.99;
                break;
            case AVERAGE:
                cost = 3.99;
                break;
            case BIG:
                cost = 5.99;
                break;
        }

        return cost;
    }
}
