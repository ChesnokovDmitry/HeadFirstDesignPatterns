package org.strategy.simUDuck.duck;

import org.strategy.simUDuck.fly.FlyNoWay;
import org.strategy.simUDuck.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
