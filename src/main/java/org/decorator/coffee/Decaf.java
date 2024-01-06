package org.decorator.coffee;

import org.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        double cost = 0.0;

        switch(size) {
            case SMALL:
                cost = 1.05;
                break;
            case AVERAGE:
                cost = 1.25;
                break;
            case BIG:
                cost = 1.40;
                break;
        }

        return cost;
    }
}
