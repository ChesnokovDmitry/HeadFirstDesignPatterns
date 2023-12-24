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
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
