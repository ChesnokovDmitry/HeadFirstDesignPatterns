package org.decorator;

/**
 * Расширяем класс Beverage
 * @see Beverage будет 'заворачиваться' в каждый декоратор
 * Все декораторы должны заново реализовать getDescription()
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
