package org.strategy.adventureGame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Выстрел из лука");
    }
}
