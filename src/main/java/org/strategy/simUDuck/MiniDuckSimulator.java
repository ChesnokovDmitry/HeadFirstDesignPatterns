package org.strategy.simUDuck;

import org.strategy.simUDuck.duck.Duck;
import org.strategy.simUDuck.duck.MallardDuck;
import org.strategy.simUDuck.duck.ModelDuck;
import org.strategy.simUDuck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}