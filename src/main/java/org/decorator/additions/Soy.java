package org.decorator.additions;

import org.decorator.Beverage;
import org.decorator.CondimentDecorator;

/**
 * Класс декоратора расширяет CondimentDecorator
 * Сначала получаем описание и стоимость, делегируя вызов декорируемому объекту
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(beverage.getSize()) {
            case SMALL:
                cost += .15;
                break;
            case AVERAGE:
                cost += .25;
                break;
            case BIG:
                cost += .35;
                break;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
