package org.strategy.simUDuck;

/**
 * Реализация поведения для уток, которые не летают (резиновые)
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}