package org.strategy.simUDuck.duck;

import org.strategy.simUDuck.fly.FlyWithWings;
import org.strategy.simUDuck.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}