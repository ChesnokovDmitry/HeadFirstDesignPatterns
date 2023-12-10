package org.strategy.adventureGame;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Выстрел из лука");
    }
}
