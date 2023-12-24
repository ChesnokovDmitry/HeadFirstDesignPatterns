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
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
