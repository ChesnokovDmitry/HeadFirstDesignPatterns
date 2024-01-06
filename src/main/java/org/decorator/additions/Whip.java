package org.decorator.additions;

import org.decorator.Beverage;
import org.decorator.CondimentDecorator;

/**
 * Класс декоратора расширяет CondimentDecorator
 * Сначала получаем описание и стоимость, делегируя вызов декорируемому объекту
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(beverage.getSize()) {
            case SMALL:
                cost += .10;
                break;
            case AVERAGE:
                cost += .12;
                break;
            case BIG:
                cost += .14;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
