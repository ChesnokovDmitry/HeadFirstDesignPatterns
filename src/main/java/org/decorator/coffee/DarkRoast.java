package org.decorator.coffee;

import org.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        double cost = 0.0;

        switch(size) {
            case SMALL:
                cost = .99;
                break;
            case AVERAGE:
                cost = 1.99;
                break;
            case BIG:
                cost = 2.99;
                break;
        }

        return cost;
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
    }
}
