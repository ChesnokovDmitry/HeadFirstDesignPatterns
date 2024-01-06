package org.decorator.coffee;

import org.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        double cost = 0.0;

        switch(size) {
            case SMALL:
                cost = 0.89;
                break;
            case AVERAGE:
                cost = 1.01;
                break;
            case BIG:
                cost = 1.32;
                break;
        }

        return cost;
    }
}
