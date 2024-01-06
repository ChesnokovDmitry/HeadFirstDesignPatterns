package org.decorator.additions;

import org.decorator.Beverage;
import org.decorator.CondimentDecorator;

/**
 * Класс декоратора расширяет CondimentDecorator
 * Сначала получаем описание и стоимость, делегируя вызов декорируемому объекту
 */
public class MilkFoam extends CondimentDecorator {

    public MilkFoam(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(size) {
            case SMALL:
                cost += .20;
                break;
            case AVERAGE:
                cost += .25;
                break;
            case BIG:
                cost += .30;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk Foam";
    }
}
